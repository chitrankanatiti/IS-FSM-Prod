package com.hdsoft.fsm.engineerprofile.dto;

import java.util.Objects;

public class EngineerDTO {
    private long id;
    private String name;
    private String phoneno;
    private String altphoneno;
    private String emailid;
    private String techid;

    public EngineerDTO(long id, String name, String phoneno, String altphoneno, String emailid, String techid){
        this.id = id;
        this.name = name;
        this.phoneno = phoneno;
        this.altphoneno = altphoneno;
        this.emailid = emailid;
        this.techid = techid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EngineerDTO that = (EngineerDTO) o;
        return id == that.id && name.equals(that.name) && phoneno.equals(that.phoneno) && altphoneno.equals(that.altphoneno) && emailid.equals(that.emailid) && techid.equals(that.techid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneno, altphoneno, emailid, techid);
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
                '}';
    }
}
