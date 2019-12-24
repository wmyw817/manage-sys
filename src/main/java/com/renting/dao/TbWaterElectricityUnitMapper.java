package com.renting.dao;

import com.renting.entity.TbWaterElectricityUnit;

public interface TbWaterElectricityUnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWaterElectricityUnit record);

    int insertSelective(TbWaterElectricityUnit record);

    TbWaterElectricityUnit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbWaterElectricityUnit record);

    int updateByPrimaryKey(TbWaterElectricityUnit record);
}