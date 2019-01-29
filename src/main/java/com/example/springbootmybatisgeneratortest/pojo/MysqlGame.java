package com.example.springbootmybatisgeneratortest.pojo;

public class MysqlGame {
    private Integer id;

    private String gameName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }
}