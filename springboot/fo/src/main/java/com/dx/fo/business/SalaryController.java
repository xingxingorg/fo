package com.dx.fo.business;

import com.dx.fo.business.dao.StaffMapper;
import com.dx.fo.business.pojo.StaffPojo;
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
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    private StaffMapper staffMapper;
    @RequestMapping(value="/staff" ,method = RequestMethod.POST)
    @ResponseBody
    public List<StaffPojo> selectStaff(String pojo){
    List<StaffPojo> list=staffMapper.selectStaff(new HashMap<>());
    return list;
    }

}
