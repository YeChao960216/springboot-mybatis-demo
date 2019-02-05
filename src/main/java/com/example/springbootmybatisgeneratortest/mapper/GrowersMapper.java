package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Growers;
import com.example.springbootmybatisgeneratortest.pojo.GrowersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrowersMapper {
    int countByExample(GrowersExample example);

    int deleteByExample(GrowersExample example);

    int deleteByPrimaryKey(Integer growersId);

    int insert(Growers record);

    int insertSelective(Growers record);

    List<Growers> selectByExample(GrowersExample example);

    Growers selectByPrimaryKey(Integer growersId);

    int updateByExampleSelective(@Param("record") Growers record, @Param("example") GrowersExample example);

    int updateByExample(@Param("record") Growers record, @Param("example") GrowersExample example);

    int updateByPrimaryKeySelective(Growers record);

    int updateByPrimaryKey(Growers record);
}