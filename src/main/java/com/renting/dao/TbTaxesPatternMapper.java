package com.renting.dao;

import com.renting.entity.TbTaxesPattern;

public interface TbTaxesPatternMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTaxesPattern record);

    int insertSelective(TbTaxesPattern record);

    TbTaxesPattern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTaxesPattern record);

    int updateByPrimaryKey(TbTaxesPattern record);
}