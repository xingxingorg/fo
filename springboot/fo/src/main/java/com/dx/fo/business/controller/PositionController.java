package com.dx.fo.business.controller;

import com.dx.fo.base.common.UUIDHelp;
import com.dx.fo.business.dao.PositionMapper;
import com.dx.fo.business.dao.StaffMapper;
import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.PositionPojo;
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
    private PositionMapper positionMapper;

    @RequestMapping(value="/validposition" ,method = RequestMethod.POST)
    @ResponseBody
    public List<PositionPojo> selectValidPosition(String pojo){
        List<PositionPojo> list=positionMapper.selectValidPosition();
        return list;
    }
    @RequestMapping(value = "/position", method = RequestMethod.POST)
    @ResponseBody
    public List<PositionPojo> selectPosition(ConditionPojo condi) {
        List<PositionPojo> list = positionMapper.selectPosition(condi);
        return list;
    }

    @RequestMapping(value = "/addposition", method = RequestMethod.POST)
    @ResponseBody
    public String addPosition(PositionPojo pojo) {
        if (pojo.getCId() == null) {
            pojo.setCId(UUIDHelp.newUUID());
            positionMapper.insertPosition(pojo);
        } else {
            positionMapper.updatePosition(pojo);
        }

        return "ok";
    }

    @RequestMapping(value = "/delposition", method = RequestMethod.POST)
    @ResponseBody
    public String delPosition(String cid) {

        positionMapper.delPosition(cid);
        return "ok";
    }

    @RequestMapping(value = "/validposi", method = RequestMethod.POST)
    @ResponseBody
    public String validPosition(String cid, int valid) {
        positionMapper.validPosition(cid, valid);
        return "ok";
    }
}
