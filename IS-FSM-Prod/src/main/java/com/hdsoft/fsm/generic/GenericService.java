package com.hdsoft.fsm.generic;
import com.hdsoft.fsm.utils.SortingOrder;
import java.util.List;
import java.util.Optional;

public interface GenericService<E, M> {
        E save(E entity);

        List<E> save(List<E> entities);

        boolean update(E entity);

        boolean delete(E entity);

        boolean deleteById(M id);

        Optional<E> findById(M id);

        List<E> findAll();

        List<E> findAllSorted(SortingOrder order);

        long count();

        boolean existsById(M id);
}
