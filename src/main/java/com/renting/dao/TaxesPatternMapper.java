package com.renting.dao;

import com.renting.entity.TaxesPattern;

public interface TaxesPatternMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaxesPattern record);

    int insertSelective(TaxesPattern record);

    TaxesPattern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaxesPattern record);

    int updateByPrimaryKey(TaxesPattern record);
}