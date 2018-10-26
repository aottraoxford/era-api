package com.eracambodia.era.model.api_users;

import com.eracambodia.era.setting.Default;

public class Users {
    private Integer id;
    private String uuid;
    private Boolean enable;
    private String name;
    private String email;
    private String phone;
    private String registerDate;
    private String profilePhoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getProfilePhoto() {
        if (profilePhoto != null)
            return Default.profilePhoto;
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", enable=" + enable +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }
}
