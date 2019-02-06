package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Grow;
import com.example.springbootmybatisgeneratortest.pojo.GrowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GrowMapper {
    int countByExample(GrowExample example);

    int deleteByExample(GrowExample example);

    int deleteByPrimaryKey(String growId);

    int insert(Grow record);

    int insertSelective(Grow record);

    List<Grow> selectByExample(GrowExample example);

    Grow selectByPrimaryKey(String growId);

    int updateByExampleSelective(@Param("record") Grow record, @Param("example") GrowExample example);

    int updateByExample(@Param("record") Grow record, @Param("example") GrowExample example);

    int updateByPrimaryKeySelective(Grow record);

    int updateByPrimaryKey(Grow record);
}