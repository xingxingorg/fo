package com.dx.fo.business.dao;

import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.PositionPojo;
import com.dx.fo.business.pojo.StaffPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PositionMapper {
    public  int insertPosition(PositionPojo pojo );
    public  int updatePosition(PositionPojo pojo );
    public  int validPosition(@Param("CId") String CId, @Param("NValid") int NValid );
    public  int delPosition(@Param("CId") String CId );
    public List<PositionPojo> selectPosition(@Param("condi") ConditionPojo condi);
    public List<PositionPojo> selectValidPosition();

    public PositionPojo selectPositionById(@Param("CId") String CId);
}
