package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.MysqlGameMapper;
import com.example.springbootmybatisgeneratortest.pojo.MysqlGame;
import com.example.springbootmybatisgeneratortest.service.MysqlGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ChaceYip
 * @create2018 -02 -02 -12:25
 */
@Service
public class MysqlGameServiceImpl implements MysqlGameService {

    @Autowired
    MysqlGameMapper mysqlGameMapper;

    @Override
    public void add(MysqlGame mysqlGame) {
        mysqlGameMapper.insert(mysqlGame);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(MysqlGame mysqlGame) {

    }

    @Override
    public MysqlGame get(int id) {
        return mysqlGameMapper.selectByPrimaryKey(id);
    }
}
