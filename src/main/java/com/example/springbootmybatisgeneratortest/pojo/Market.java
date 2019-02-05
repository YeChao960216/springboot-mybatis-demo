package com.example.springbootmybatisgeneratortest.pojo;

public class Market {
    private String originId;

    private String marketName;

    private String phone;

    private String license;

    private String address;

    private String scanTime;

    private String flag;

    private String transId;

    private Integer growId;

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId == null ? null : originId.trim();
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime == null ? null : scanTime.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public Integer getGrowId() {
        return growId;
    }

    public void setGrowId(Integer growId) {
        this.growId = growId;
    }
}