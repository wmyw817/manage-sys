package com.renting.dao;

import com.renting.entity.TbChummage;

public interface TbChummageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbChummage record);

    int insertSelective(TbChummage record);

    TbChummage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbChummage record);

    int updateByPrimaryKey(TbChummage record);
}