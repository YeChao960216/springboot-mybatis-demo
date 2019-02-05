package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Chemicals;
import com.example.springbootmybatisgeneratortest.pojo.ChemicalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChemicalsMapper {
    int countByExample(ChemicalsExample example);

    int deleteByExample(ChemicalsExample example);

    int deleteByPrimaryKey(Integer chemicalsId);

    int insert(Chemicals record);

    int insertSelective(Chemicals record);

    List<Chemicals> selectByExample(ChemicalsExample example);

    Chemicals selectByPrimaryKey(Integer chemicalsId);

    int updateByExampleSelective(@Param("record") Chemicals record, @Param("example") ChemicalsExample example);

    int updateByExample(@Param("record") Chemicals record, @Param("example") ChemicalsExample example);

    int updateByPrimaryKeySelective(Chemicals record);

    int updateByPrimaryKey(Chemicals record);
}