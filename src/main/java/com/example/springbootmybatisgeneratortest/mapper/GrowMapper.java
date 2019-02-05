package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Grow;
import com.example.springbootmybatisgeneratortest.pojo.GrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrowMapper {
    int countByExample(GrowExample example);

    int deleteByExample(GrowExample example);

    int deleteByPrimaryKey(Integer growId);

    int insert(Grow record);

    int insertSelective(Grow record);

    List<Grow> selectByExample(GrowExample example);

    Grow selectByPrimaryKey(Integer growId);

    int updateByExampleSelective(@Param("record") Grow record, @Param("example") GrowExample example);

    int updateByExample(@Param("record") Grow record, @Param("example") GrowExample example);

    int updateByPrimaryKeySelective(Grow record);

    int updateByPrimaryKey(Grow record);
}