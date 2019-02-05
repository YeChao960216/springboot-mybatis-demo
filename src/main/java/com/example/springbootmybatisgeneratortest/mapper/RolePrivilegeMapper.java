package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.RolePrivilege;
import com.example.springbootmybatisgeneratortest.pojo.RolePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePrivilegeMapper {
    int countByExample(RolePrivilegeExample example);

    int deleteByExample(RolePrivilegeExample example);

    int deleteByPrimaryKey(Integer rolePrivilegeId);

    int insert(RolePrivilege record);

    int insertSelective(RolePrivilege record);

    List<RolePrivilege> selectByExample(RolePrivilegeExample example);

    RolePrivilege selectByPrimaryKey(Integer rolePrivilegeId);

    int updateByExampleSelective(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);

    int updateByExample(@Param("record") RolePrivilege record, @Param("example") RolePrivilegeExample example);

    int updateByPrimaryKeySelective(RolePrivilege record);

    int updateByPrimaryKey(RolePrivilege record);
}