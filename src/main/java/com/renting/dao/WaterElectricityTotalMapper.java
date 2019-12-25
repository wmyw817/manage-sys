package com.renting.dao;

import com.renting.entity.WaterElectricityTotal;

public interface WaterElectricityTotalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WaterElectricityTotal record);

    int insertSelective(WaterElectricityTotal record);

    WaterElectricityTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WaterElectricityTotal record);

    int updateByPrimaryKey(WaterElectricityTotal record);
}