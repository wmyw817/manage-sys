package com.renting.dao;

import com.renting.entity.TbWaterElectricityTotal;

public interface TbWaterElectricityTotalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWaterElectricityTotal record);

    int insertSelective(TbWaterElectricityTotal record);

    TbWaterElectricityTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbWaterElectricityTotal record);

    int updateByPrimaryKey(TbWaterElectricityTotal record);
}