package com.hdsoft.fsm.engineerprofile.dto;

import java.util.Arrays;
import java.util.Objects;

public class EngineerDTO {
    private long id;
    private String name;
    private String phoneno;
    private String altphoneno;
    private String emailid;
    private String techid;
    private byte[] image;
    private String dateOfCreation;
    private String uniqueId;

    public EngineerDTO(long id, String getname, String s, String getaltPhoneNo, String getemailId, String gettechId){

    }

    public EngineerDTO(long id, String name, String phoneno, String altphoneno, String emailid, String techid, byte[] image, String dateOfCreation, String uniqueId){
        this.id = id;
        this.name = name;
        this.phoneno = phoneno;
        this.altphoneno = altphoneno;
        this.emailid = emailid;
        this.techid = techid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAltphoneno() {
        return altphoneno;
    }

    public void setAltphoneno(String altphoneno) {
        this.altphoneno = altphoneno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getTechid() {
        return techid;
    }

    public void setTechid(String techid) {
        this.techid = techid;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EngineerDTO)) return false;
        EngineerDTO that = (EngineerDTO) o;
        return id == that.id && name.equals(that.name) && phoneno.equals(that.phoneno) && altphoneno.equals(that.altphoneno) && emailid.equals(that.emailid) && techid.equals(that.techid) && Arrays.equals(image, that.image) && dateOfCreation.equals(that.dateOfCreation) && uniqueId.equals(that.uniqueId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, phoneno, altphoneno, emailid, techid, dateOfCreation, uniqueId);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @Override
    public String toString() {
        return "EngineerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", altphoneno='" + altphoneno + '\'' +
                ", emailid='" + emailid + '\'' +
                ", techid='" + techid + '\'' +
                ", image=" + Arrays.toString(image) +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }
}
