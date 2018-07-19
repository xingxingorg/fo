package com.dx.fo.business.pojo;

/**
 * 职员实体类
 */
public class StaffPojo {
    private String CId;
    private String CName;
    private String CPosition;
    private int NSex;
    private String CTelPhone;
    private String CPositionId;
    private double NBasicWage;
    private double NRadishPrice;
    private double NCarrotPrice;
    private double NLoadingPrice;
    private int NValid;

    public void setNValid(int NValid) {
        this.NValid = NValid;
    }


    public int getNValid() {
        return NValid;
    }


    public String getCPositionId() {
        return CPositionId;
    }

    public void setCPositionId(String CPositionId) {
        this.CPositionId = CPositionId;
    }

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


    public void setCPosition(String CPosition) {
        this.CPosition = CPosition;
    }

    public void setNSex(int NSex) {
        this.NSex = NSex;
    }

    public void setCTelPhone(String CTelPhone) {
        this.CTelPhone = CTelPhone;
    }

    public String getCId() {

        return CId;
    }

    public String getCName() {
        return CName;
    }

    public String getCPosition() {
        return CPosition;
    }

    public int getNSex() {
        return NSex;
    }

    public String getCTelPhone() {
        return CTelPhone;
    }


}
