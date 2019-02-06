package com.example.springbootmybatisgeneratortest.pojo;

import java.util.Date;

public class Growers {
    private String growersId;

    private String name;

    private String idCard;

    private String phone;

    private String farm;

    private String flag;

    private Date createTime;

    public String getGrowersId() {
        return growersId;
    }

    public void setGrowersId(String growersId) {
        this.growersId = growersId == null ? null : growersId.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}