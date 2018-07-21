package com.dx.fo.business.controller;

import com.dx.fo.base.common.UUIDHelp;
import com.dx.fo.business.dao.StaffMapper;
import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.StaffPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * 职员控制器
 * Created by Administrator on 2018/7/19.
 */
@Controller
@RequestMapping("/fo")
public class StaffController {
    @Autowired
    private StaffMapper staffMapper;

    @RequestMapping(value = "/staff", method = RequestMethod.POST)
    @ResponseBody
    public List<StaffPojo> selectStaff(ConditionPojo condi) {
        List<StaffPojo> list = staffMapper.selectStaff(condi);
        return list;
    }

    @RequestMapping(value = "/addstaff", method = RequestMethod.POST)
    @ResponseBody
    public String addStaff(StaffPojo pojo) {
        if (pojo.getCId() == null) {
            pojo.setCId(UUIDHelp.newUUID());
            staffMapper.insertStaff(pojo);
        } else {
            staffMapper.updateStaff(pojo);
        }

        return "ok";
    }

    @RequestMapping(value = "/delstaff", method = RequestMethod.POST)
    @ResponseBody
    public String delStaff(String cid) {

        staffMapper.delStaff(cid);
        return "ok";
    }

    @RequestMapping(value = "/validstaff", method = RequestMethod.POST)
    @ResponseBody
    public String validStaff(String cid, int valid) {
        staffMapper.validStaff(cid, valid);
        return "ok";
    }
}
