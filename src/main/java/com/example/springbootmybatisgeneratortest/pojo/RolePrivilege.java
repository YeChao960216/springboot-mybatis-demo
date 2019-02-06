package com.example.springbootmybatisgeneratortest.pojo;

public class RolePrivilege {
    private String rolePrivilegeId;

    private String roleId;

    private String privilegeId;

    public String getRolePrivilegeId() {
        return rolePrivilegeId;
    }

    public void setRolePrivilegeId(String rolePrivilegeId) {
        this.rolePrivilegeId = rolePrivilegeId == null ? null : rolePrivilegeId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(String privilegeId) {
        this.privilegeId = privilegeId == null ? null : privilegeId.trim();
    }
}