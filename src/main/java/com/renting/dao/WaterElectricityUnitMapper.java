package com.renting.dao;

import com.renting.entity.WaterElectricityUnit;

public interface WaterElectricityUnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WaterElectricityUnit record);

    int insertSelective(WaterElectricityUnit record);

    WaterElectricityUnit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WaterElectricityUnit record);

    int updateByPrimaryKey(WaterElectricityUnit record);
}