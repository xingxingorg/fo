package com.dx.fo.business.dao;

import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.PositionPojo;
import com.dx.fo.business.pojo.StaffPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper
public interface StaffMapper {
    public  int insertStaff(StaffPojo staffPojo );
    public  int updateStaff(StaffPojo staffPojo );
    public  int validStaff(@Param("CId") String CId,@Param("NValid") int NValid );
    public  int delStaff(@Param("CId") String CId );
    public List<StaffPojo> selectStaff(@Param("condi") ConditionPojo condi);
    public List<StaffPojo> selectvalidStaff(@Param("CPositionId") String CPositionId);
}

