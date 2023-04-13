package com.hdsoft.fsm.engineerprofile.repository;

import com.hdsoft.fsm.engineerprofile.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface EngineerRepository extends JpaRepository<Engineer, Long>{
    @Query("SELECT e FROM Engineer e WHERE lower(e.name) like lower(concat('%', :name,'%'))") //JPQL
    List<Engineer> findByName(@Param("name") String name);

    @Query("SELECT e FROM Engineer e WHERE e.phoneNo like concat('%', :phoneNo,'%') ")
    List<Engineer> findByPhoneNo(@Param("phoneNO") String phoneNo);

    @Query("SELECT e FROM Engineer e WHERE e.altPhoneNo like concat('%', :altPhoneNo,'%') ")
    List<Engineer> findByAltPhoneNo(@Param("altPhoneNo") String altPhoneNo);

    @Query("SELECT e FROM Engineer e WHERE e.emailId = :emailId")
    List<Engineer> findByEmailId(@Param("emailId") String emailId);

    @Query("SELECT e FROM Engineer e WHERE lower(e.techId) = lower(:techId)")
    Optional<Engineer> findByTechId(@Param("techId") String techId);

    @Query("SELECT e FROM Engineer e WHERE e.dateOfCreation = :dateOfCreation")
    List<Engineer> findByDateOfCreation(@Param("dateOfCreation") String dateOfCreation);

    @Query("SELECT e FROM Engineer e WHERE e.uniqueId = :uniqueId")
    Optional<Engineer> findByUniqueId(@Param("uniqueId") String uniqueId);
}