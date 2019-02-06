package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Privilege;

import java.util.List;

public interface PrivilegeService {
    int insert(Privilege entity) throws Exception;

    int update(Privilege entity) throws Exception;

    int delete(Privilege entity) throws Exception;

    List<Privilege> select(Privilege entity) throws Exception;
}
