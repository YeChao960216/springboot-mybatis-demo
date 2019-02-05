package com.example.springbootmybatisgeneratortest.pojo;

public class Grow {
    private Integer growId;

    private Integer growerId;

    private String growerTime;

    private String harvestTime;

    private String flag;

    private Double weight;

    private String unit;

    public Integer getGrowId() {
        return growId;
    }

    public void setGrowId(Integer growId) {
        this.growId = growId;
    }

    public Integer getGrowerId() {
        return growerId;
    }

    public void setGrowerId(Integer growerId) {
        this.growerId = growerId;
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
}