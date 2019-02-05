package com.example.springbootmybatisgeneratortest.pojo;

public class Growers {
    private Integer growersId;

    private String name;

    private String idCard;

    private String phone;

    private String farm;

    private String flag;

    public Integer getGrowersId() {
        return growersId;
    }

    public void setGrowersId(Integer growersId) {
        this.growersId = growersId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm == null ? null : farm.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}