package com.dx.fo.business.dao;

import com.dx.fo.business.pojo.PositionPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PositionMapper {
    public  int insertPosition(PositionPojo positionPojo );
    public  int updatePosition(PositionPojo positionPojo );
    public  int unValidPosition(String CId );
    public List<PositionPojo> selectPosition(Map<String,Object> condition);
}
