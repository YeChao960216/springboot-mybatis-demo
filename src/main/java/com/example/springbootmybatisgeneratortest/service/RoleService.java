package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Role;

import java.util.List;

public interface RoleService {
    int insert(Role entity) throws Exception;

    int update(Role entity) throws Exception;

    int delete(Role entity) throws Exception;

    List<Role> select(Role entity) throws Exception;
}
