package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.Trans;
import com.example.springbootmybatisgeneratortest.pojo.TransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransMapper {
    int countByExample(TransExample example);

    int deleteByExample(TransExample example);

    int deleteByPrimaryKey(String transId);

    int insert(Trans record);

    int insertSelective(Trans record);

    List<Trans> selectByExample(TransExample example);

    Trans selectByPrimaryKey(String transId);

    int updateByExampleSelective(@Param("record") Trans record, @Param("example") TransExample example);

    int updateByExample(@Param("record") Trans record, @Param("example") TransExample example);

    int updateByPrimaryKeySelective(Trans record);

    int updateByPrimaryKey(Trans record);
}