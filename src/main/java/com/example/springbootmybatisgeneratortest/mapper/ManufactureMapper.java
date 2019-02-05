package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Manufacture;
import com.example.springbootmybatisgeneratortest.pojo.ManufactureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufactureMapper {
    int countByExample(ManufactureExample example);

    int deleteByExample(ManufactureExample example);

    int deleteByPrimaryKey(Integer manufactureId);

    int insert(Manufacture record);

    int insertSelective(Manufacture record);

    List<Manufacture> selectByExample(ManufactureExample example);

    Manufacture selectByPrimaryKey(Integer manufactureId);

    int updateByExampleSelective(@Param("record") Manufacture record, @Param("example") ManufactureExample example);

    int updateByExample(@Param("record") Manufacture record, @Param("example") ManufactureExample example);

    int updateByPrimaryKeySelective(Manufacture record);

    int updateByPrimaryKey(Manufacture record);
}