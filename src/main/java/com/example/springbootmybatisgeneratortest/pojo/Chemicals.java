package com.example.springbootmybatisgeneratortest.pojo;

public class Chemicals {
    private Integer chemicalsId;

    private Integer growId;

    private String useDate;

    private String formula;

    private Double dosage;

    private String flag;

    public Integer getChemicalsId() {
        return chemicalsId;
    }

    public void setChemicalsId(Integer chemicalsId) {
        this.chemicalsId = chemicalsId;
    }

    public Integer getGrowId() {
        return growId;
    }

    public void setGrowId(Integer growId) {
        this.growId = growId;
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
}