package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Growers;
import com.example.springbootmybatisgeneratortest.pojo.GrowersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GrowersMapper {
    int countByExample(GrowersExample example);

    int deleteByExample(GrowersExample example);

    int deleteByPrimaryKey(String growersId);

    int insert(Growers record);

    int insertSelective(Growers record);

    List<Growers> selectByExample(GrowersExample example);

    Growers selectByPrimaryKey(String growersId);

    int updateByExampleSelective(@Param("record") Growers record, @Param("example") GrowersExample example);

    int updateByExample(@Param("record") Growers record, @Param("example") GrowersExample example);

    int updateByPrimaryKeySelective(Growers record);

    int updateByPrimaryKey(Growers record);
}