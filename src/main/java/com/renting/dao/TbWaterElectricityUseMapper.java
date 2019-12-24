package com.renting.dao;

import com.renting.entity.TbWaterElectricityUse;

public interface TbWaterElectricityUseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWaterElectricityUse record);

    int insertSelective(TbWaterElectricityUse record);

    TbWaterElectricityUse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbWaterElectricityUse record);

    int updateByPrimaryKey(TbWaterElectricityUse record);
}