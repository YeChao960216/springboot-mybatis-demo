package com.example.springbootmybatisgeneratortest.pojo;

import java.util.Date;

public class Grow {
    private String growId;

    private String growerId;

    private String growerTime;

    private String harvestTime;

    private String flag;

    private Double weight;

    private String unit;

    private Date createTime;

    public String getGrowId() {
        return growId;
    }

    public void setGrowId(String growId) {
        this.growId = growId == null ? null : growId.trim();
    }

    public String getGrowerId() {
        return growerId;
    }

    public void setGrowerId(String growerId) {
        this.growerId = growerId == null ? null : growerId.trim();
    }

    public String getGrowerTime() {
        return growerTime;
    }

    public void setGrowerTime(String growerTime) {
        this.growerTime = growerTime == null ? null : growerTime.trim();
    }

    public String getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(String harvestTime) {
        this.harvestTime = harvestTime == null ? null : harvestTime.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}