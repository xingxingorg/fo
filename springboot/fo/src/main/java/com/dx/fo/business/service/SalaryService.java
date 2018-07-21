package com.dx.fo.business.service;

import com.dx.fo.base.common.UUIDHelp;
import com.dx.fo.business.dao.PositionMapper;
import com.dx.fo.business.dao.SalaryRecordMapper;
import com.dx.fo.business.dao.StaffMapper;
import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.PositionPojo;
import com.dx.fo.business.pojo.SalaryRecordPojo;
import com.dx.fo.business.pojo.StaffPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/21.
 */
@Service
public class SalaryService {
    @Autowired
    private SalaryRecordMapper salaryRecordMapper;
    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private StaffMapper staffMapper;
    public String insertSalary(SalaryRecordPojo pojo) {
        SalaryRecordPojo obj=calculate( pojo);
        if ( StringUtils.isEmpty(pojo.getCId())) {
            pojo.setCId(UUIDHelp.newUUID());
            salaryRecordMapper.insertSalary(obj);
        } else {
            salaryRecordMapper.updateSalary(obj);
        }
        return "ok";
    }
    public String insertPosiSalary(SalaryRecordPojo pojo) {
        SalaryRecordPojo obj=calculate( pojo);
        List<StaffPojo> staffs=staffMapper.selectvalidStaff(pojo.getCPositionId());
        double count=staffs.size();
        List<SalaryRecordPojo> list=new ArrayList<SalaryRecordPojo>();
        double carr=obj.getNCarrotQuantity()/count;
        double load=obj.getNLoadingQuantity()/count;
        double radi=obj.getNRadishQuantity()/count;
        double money=obj.getNRealSalary()/count;
        for(StaffPojo staffPojo:staffs){
            SalaryRecordPojo o=new SalaryRecordPojo();
            o.setCId(UUIDHelp.newUUID());
            o.setStaffId(staffPojo.getCId());
            o.setCPositionId(obj.getCPositionId());
            o.setDInsertDate(obj.getDInsertDate());
            o.setDYear(obj.getDYear());
            o.setDMonth(obj.getDMonth());
            o.setNWorkingHours(obj.getNWorkingHours());
            o.setNOvertimeWork(obj.getNOvertimeWork());
            o.setNCarrotQuantity(carr);
            o.setNRadishQuantity(radi);
            o.setNLoadingQuantity(load);
            o.setNRealSalary(money);
            list.add(o);
        }
            salaryRecordMapper.deleteSalary(obj.getCPositionId(),obj.getDInsertDate());
            salaryRecordMapper.batchSalary(list);
        return "ok";
    }

    private SalaryRecordPojo calculate(SalaryRecordPojo pojo){
        PositionPojo position= positionMapper.selectPositionById(pojo.getCPositionId());
        double carr=pojo.getNCarrotQuantity()*position.getNCarrotPrice();
        double load=pojo.getNLoadingQuantity()*position.getNLoadingPrice();
        double radi=pojo.getNRadishQuantity()*position.getNRadishPrice();
        pojo.setNRealSalary(carr+load+radi);
        //切割日期
        String[] str =pojo.getDInsertDate().split("-");
        pojo.setDYear(str[0]);
        pojo.setDMonth(str[1]);
        return  pojo;
    }
}
