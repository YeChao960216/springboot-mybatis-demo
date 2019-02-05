package com.example.springbootmybatisgeneratortest.pojo;

public class RolePrivilege {
    private Integer rolePrivilegeId;

    private Integer roleId;

    private Integer privilegeId;

    public Integer getRolePrivilegeId() {
        return rolePrivilegeId;
    }

    public void setRolePrivilegeId(Integer rolePrivilegeId) {
        this.rolePrivilegeId = rolePrivilegeId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
}