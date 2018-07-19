package com.dx.fo.business.dao;

import com.dx.fo.business.pojo.PositionPojo;
import com.dx.fo.business.pojo.StaffPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface StaffMapper {
    public  int insertStaff(StaffPojo staffPojo );
    public  int updateStaff(StaffPojo staffPojo );
 //   public  int unValidStaff(String CId );
    public List<StaffPojo> selectStaff(Map<String,Object> condition);
}

