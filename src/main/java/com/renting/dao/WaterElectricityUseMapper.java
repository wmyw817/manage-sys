package com.renting.dao;

import com.renting.entity.WaterElectricityUse;

public interface WaterElectricityUseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WaterElectricityUse record);

    int insertSelective(WaterElectricityUse record);

    WaterElectricityUse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WaterElectricityUse record);

    int updateByPrimaryKey(WaterElectricityUse record);
}