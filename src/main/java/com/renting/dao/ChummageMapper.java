package com.renting.dao;

import com.renting.entity.Chummage;

public interface ChummageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chummage record);

    int insertSelective(Chummage record);

    Chummage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Chummage record);

    int updateByPrimaryKey(Chummage record);
}