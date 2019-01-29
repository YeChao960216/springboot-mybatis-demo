package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.pojo.MysqlGame;
import com.example.springbootmybatisgeneratortest.service.MysqlGameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlGameServiceImplTest {

    @Autowired
    MysqlGameService mysqlGameService;

    @Test
    public void add() {
        MysqlGame mysqlGame=new MysqlGame();
        mysqlGame.setGameName("测试");
        mysqlGameService.add(mysqlGame);
    }

    @Test
    public void get() {
        System.out.println(mysqlGameService.get(1));
    }
}