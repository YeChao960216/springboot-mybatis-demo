package com.example.springbootmybatisgeneratortest.mapper;

import com.example.springbootmybatisgeneratortest.pojo.MysqlGame;
import com.example.springbootmybatisgeneratortest.pojo.MysqlGameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MysqlGameMapper {
    int countByExample(MysqlGameExample example);

    int deleteByExample(MysqlGameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MysqlGame record);

    int insertSelective(MysqlGame record);

    List<MysqlGame> selectByExample(MysqlGameExample example);

    MysqlGame selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MysqlGame record, @Param("example") MysqlGameExample example);

    int updateByExample(@Param("record") MysqlGame record, @Param("example") MysqlGameExample example);

    int updateByPrimaryKeySelective(MysqlGame record);

    int updateByPrimaryKey(MysqlGame record);
}