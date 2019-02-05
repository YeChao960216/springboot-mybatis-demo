package com.example.springbootmybatisgeneratortest.pojo;

public class Privilege {
    private Integer privilegeId;

    private String privilegeName;

    private String privilegeLink;

    private String flag;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeLink() {
        return privilegeLink;
    }

    public void setPrivilegeLink(String privilegeLink) {
        this.privilegeLink = privilegeLink == null ? null : privilegeLink.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}