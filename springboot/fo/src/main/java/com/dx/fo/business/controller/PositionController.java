package com.dx.fo.business.controller;

import com.dx.fo.business.dao.StaffMapper;
import com.dx.fo.business.pojo.StaffPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**职务控制器
 * Created by Administrator on 2018/7/19.
 */
@Controller
@RequestMapping("/fo")
public class PositionController {
    @Autowired
    private StaffMapper staffMapper;
    @RequestMapping(value="/position" ,method = RequestMethod.POST)
    @ResponseBody
    public List<StaffPojo> selectPosition(String pojo){
        List<StaffPojo> list=staffMapper.selectStaff(new HashMap<>());
        return list;
    }
}
