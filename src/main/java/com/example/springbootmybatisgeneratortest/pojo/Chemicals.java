package com.example.springbootmybatisgeneratortest.pojo;

import java.util.Date;

public class Chemicals {
    private String chemicalsId;

    private String growId;

    private String useDate;

    private String formula;

    private Double dosage;

    private String flag;

    private Date createTime;

    public String getChemicalsId() {
        return chemicalsId;
    }

    public void setChemicalsId(String chemicalsId) {
        this.chemicalsId = chemicalsId == null ? null : chemicalsId.trim();
    }

    public String getGrowId() {
        return growId;
    }

    public void setGrowId(String growId) {
        this.growId = growId == null ? null : growId.trim();
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate == null ? null : useDate.trim();
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
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