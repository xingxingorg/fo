package com.dx.fo.business.dao;

import com.dx.fo.business.pojo.ConditionPojo;
import com.dx.fo.business.pojo.PositionPojo;
import com.dx.fo.business.pojo.SalaryRecordPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SalaryRecordMapper {

    public List<SalaryRecordPojo> selectSalaryRecord(@Param("condi") ConditionPojo condi);
    public  int insertSalary(SalaryRecordPojo pojo );
    public  int updateSalary(SalaryRecordPojo pojo );
    public  int deleteSalary(@Param("CPosition") String CPosition,@Param("DInsertDate") String DInsertDate );
    public  int batchSalary(List<SalaryRecordPojo> list );
    public List<SalaryRecordPojo> selectMonthRecord(@Param("condi") ConditionPojo condi);

}
