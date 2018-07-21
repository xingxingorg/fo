package com.dx.fo.business.pojo;

/**
 * 职务实体类
 */
public class PositionPojo {
    private String CId;
    private String CName;
    private double NBasicWage;
    private double NRadishPrice;
    private double NCarrotPrice;
    private double NLoadingPrice;
    private int NValid;
    public void setCId(String CId) {
        this.CId = CId;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public void setNBasicWage(double NBasicWage) {
        this.NBasicWage = NBasicWage;
    }

    public void setNRadishPrice(double NRadishPrice) {
        this.NRadishPrice = NRadishPrice;
    }

    public void setNCarrotPrice(double NCarrotPrice) {
        this.NCarrotPrice = NCarrotPrice;
    }

    public void setNLoadingPrice(double NLoadingPrice) {
        this.NLoadingPrice = NLoadingPrice;
    }

    public String getCId() {

        return CId;
    }

    public String getCName() {
        return CName;
    }

    public double getNBasicWage() {
        return NBasicWage;
    }

    public double getNRadishPrice() {
        return NRadishPrice;
    }

    public double getNCarrotPrice() {
        return NCarrotPrice;
    }

    public double getNLoadingPrice() {
        return NLoadingPrice;
    }

    public int getNValid() {
        return NValid;
    }
    public void setNValid(int NValid) {
        this.NValid = NValid;
    }

}
