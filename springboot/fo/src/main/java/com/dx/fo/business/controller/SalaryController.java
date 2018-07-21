package com.dx.fo.business.controller;

import com.dx.fo.base.common.UUIDHelp;
import com.dx.fo.business.dao.SalaryRecordMapper;
import com.dx.fo.business.dao.StaffMapper;
import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.SalaryRecordPojo;
import com.dx.fo.business.pojo.StaffPojo;
import com.dx.fo.business.service.SalaryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * 工资记录控制器
 */
@Controller
@RequestMapping("/fo")
public class SalaryController {
    @Autowired
    private SalaryRecordMapper salaryRecordMapper;
    @Autowired
    private SalaryService SalaryService;
    @RequestMapping(value = "/salary", method = RequestMethod.POST)
    @ResponseBody
    public List<SalaryRecordPojo> selectSalaryRecord(@Param("condi") ConditionPojo condi) {
        List<SalaryRecordPojo> list = salaryRecordMapper.selectSalaryRecord(condi);
        return list;
    }
    @RequestMapping(value = "/addSalary", method = RequestMethod.POST)
    @ResponseBody
    public String insertSalary(SalaryRecordPojo pojo) {
        SalaryService.insertSalary(pojo);
        return "ok";
    }
    @RequestMapping(value = "/addposiSalary", method = RequestMethod.POST)
    @ResponseBody
    public String insertPosiSalary(SalaryRecordPojo pojo) {
        SalaryService.insertPosiSalary(pojo);
        return "ok";
    }
    @RequestMapping(value = "/monthRecord", method = RequestMethod.POST)
    @ResponseBody
    public List<SalaryRecordPojo> selectMonthRecord(@Param("condi") ConditionPojo condi) {
        List<SalaryRecordPojo> list = salaryRecordMapper.selectMonthRecord(condi);
        return list;
    }
}
