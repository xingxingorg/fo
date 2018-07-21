package com.dx.fo.business.pojo;

import java.util.Date;

/**
 * 工资记录实体
 */
public class SalaryRecordPojo {
    private String CId;
    private String StaffId;
    private String CName;
    private String CPosition;
    private String CPositionId;
    private String CSex;
    private double NBasicWage;
    private double NRadishPrice;
    private double NRadishQuantity;
    private double NCarrotPrice;
    private double NCarrotQuantity;
    private double NLoadingPrice;
    private double NLoadingQuantity;
    private double NRealSalary;
    private double NWorkingHours;
    private double NOvertimeWork;
    private String DInsertDate;
    private String DYear;
    private String DMonth;
    public String getDYear() {
        return DYear;
    }

    public void setDYear(String DYear) {
        this.DYear = DYear;
    }


    public String getDMonth() {
        return DMonth;
    }

    public void setDMonth(String DMonth) {
        this.DMonth = DMonth;
    }



    public void setCId(String CId) {
        this.CId = CId;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public void setCPosition(String CPosition) {
        this.CPosition = CPosition;
    }

    public void setCSex(String CSex) {
        this.CSex = CSex;
    }

    public void setNBasicWage(double NBasicWage) {
        this.NBasicWage = NBasicWage;
    }

    public void setNRadishPrice(double NRadishPrice) {
        this.NRadishPrice = NRadishPrice;
    }

    public void setNRadishQuantity(double NRadishQuantity) {
        this.NRadishQuantity = NRadishQuantity;
    }

    public void setNCarrotPrice(double NCarrotPrice) {
        this.NCarrotPrice = NCarrotPrice;
    }

    public void setNCarrotQuantity(double NCarrotQuantity) {
        this.NCarrotQuantity = NCarrotQuantity;
    }

    public void setNLoadingPrice(double NLoadingPrice) {
        this.NLoadingPrice = NLoadingPrice;
    }

    public void setNLoadingQuantity(double NLoadingQuantity) {
        this.NLoadingQuantity = NLoadingQuantity;
    }

    public void setNRealSalary(double NRealSalary) {
        this.NRealSalary = NRealSalary;
    }

    public void setNWorkingHours(double NWorkingHours) {
        this.NWorkingHours = NWorkingHours;
    }

    public void setNOvertimeWork(double NOvertimeWork) {
        this.NOvertimeWork = NOvertimeWork;
    }

    public void setDInsertDate(String DInsertDate) {
        this.DInsertDate = DInsertDate;
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

    public String getCSex() {
        return CSex;
    }

    public double getNBasicWage() {
        return NBasicWage;
    }

    public double getNRadishPrice() {
        return NRadishPrice;
    }

    public double getNRadishQuantity() {
        return NRadishQuantity;
    }

    public double getNCarrotPrice() {
        return NCarrotPrice;
    }

    public double getNCarrotQuantity() {
        return NCarrotQuantity;
    }

    public double getNLoadingPrice() {
        return NLoadingPrice;
    }

    public double getNLoadingQuantity() {
        return NLoadingQuantity;
    }

    public double getNRealSalary() {
        return NRealSalary;
    }

    public double getNWorkingHours() {
        return NWorkingHours;
    }

    public double getNOvertimeWork() {
        return NOvertimeWork;
    }

    public String getDInsertDate() {
        return DInsertDate;
    }
    public String getCPositionId() {
        return CPositionId;
    }

    public void setCPositionId(String CPositionId) {
        this.CPositionId = CPositionId;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String staffId) {
        StaffId = staffId;
    }

}
