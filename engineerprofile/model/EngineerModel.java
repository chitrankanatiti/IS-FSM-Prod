package com.hdsoft.fsm.engineerprofile.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "engineerprofile")
public class EngineerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String phoneNo;  //naming convention ==> camel case    e.g. contact number   => contactNumber
    private String altPhoneNo;
    private String emailId;
    private String techId;
    @Lob
    private byte[] image;

    public EngineerModel() {

    }

    public EngineerModel(long id, String name, String phoneNo, String altPhoneNo, String emailId, String techId){
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.altPhoneNo = altPhoneNo;
        this.emailId = emailId;
        this.techId = techId;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getphoneNo() {
        return phoneNo;
    }

    public void setphoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getaltPhoneNo() {
        return altPhoneNo;
    }

    public void setAltphoneNo(String altPhoneNo) {
        this.altPhoneNo = altPhoneNo;
    }

    public String getemailId() {
        return emailId;
    }

    public void setemailId(String emailId) {
        this.emailId = emailId;
    }

    public String gettechId() {
        return techId;
    }

    public void settechId(String techId) {
        this.techId = techId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineerModel that = (EngineerModel) o;
        return id == that.id && name.equals(that.name) && phoneNo.equals(that.phoneNo) && altPhoneNo.equals(that.altPhoneNo) && emailId.equals(that.emailId) && techId.equals(that.techId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNo, altPhoneNo, emailId, techId);
    }

    @Override
    public String toString() {
        return "EngineerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", altPhoneNo='" + altPhoneNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", techId='" + techId + '\'' +
                '}';
    }
}
