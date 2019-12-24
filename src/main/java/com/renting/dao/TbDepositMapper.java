package com.renting.dao;

import com.renting.entity.TbDeposit;

public interface TbDepositMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbDeposit record);

    int insertSelective(TbDeposit record);

    TbDeposit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbDeposit record);

    int updateByPrimaryKey(TbDeposit record);
}