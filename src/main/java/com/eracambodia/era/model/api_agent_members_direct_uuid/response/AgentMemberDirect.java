package com.eracambodia.era.model.api_agent_members_direct_uuid.response;

import com.eracambodia.era.setting.Default;

public class AgentMemberDirect {
    private String uuid;
    private String name;
    private String phone;
    private String email;
    private String parent;
    private String profilePhoto;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getProfilePhoto() {
        if (profilePhoto != null)
            return Default.profilePhoto + profilePhoto;
        return profilePhoto;
    }

    public void setProfilePhoto(String image) {
        this.profilePhoto = image;
    }

    @Override
    public String toString() {
        return "AgentMemberDirect{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", parent='" + parent + '\'' +
                ", image='" + profilePhoto + '\'' +
                '}';
    }
}
