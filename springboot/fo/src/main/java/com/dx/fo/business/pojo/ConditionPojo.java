package com.dx.fo.business.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/7/21.
 */
public class ConditionPojo {
    private String CName;
    private String CPositionId;
    private String DDate;
    public String getCName() {
        return CName;
    }

    public String getCPositionId() {
        return CPositionId;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public void setCPositionId(String CPositionId) {
        this.CPositionId = CPositionId;
    }

    public String getDDate() {
        return DDate;
    }

    public void setDDate(String DDate) {
        this.DDate = DDate;
    }
}
