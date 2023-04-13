package com.hdsoft.fsm.engineerprofile.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "engineerprofile")
public class Engineer {

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
    private String dateOfCreation;
    private String uniqueId;

    public Engineer() {

    }

    public Engineer(long id, String name, String phoneNo, String altPhoneNo, String emailId, String techId, byte[] image, String dateOfCreation, String uniqueId){
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.altPhoneNo = altPhoneNo;
        this.emailId = emailId;
        this.techId = techId;
        this.image = image;
        this.dateOfCreation = dateOfCreation;
        this.uniqueId = uniqueId;

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

    public byte[] getimage() {
        return image;
    }

    public void setimage(byte[] image) {
        this.image = image;
    }

    public String getdateOfCreation() {
        return dateOfCreation;
    }

    public void setdateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getuniqueId() {
        return uniqueId;
    }

    public void setuniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engineer)) return false;
        Engineer engineer = (Engineer) o;
        return id == engineer.id && name.equals(engineer.name) && phoneNo.equals(engineer.phoneNo) && altPhoneNo.equals(engineer.altPhoneNo) && emailId.equals(engineer.emailId) && techId.equals(engineer.techId) && Arrays.equals(image, engineer.image) && dateOfCreation.equals(engineer.dateOfCreation) && uniqueId.equals(engineer.uniqueId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, phoneNo, altPhoneNo, emailId, techId, dateOfCreation, uniqueId);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", altPhoneNo='" + altPhoneNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", techId='" + techId + '\'' +
                ", image=" + Arrays.toString(image) +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }
}
