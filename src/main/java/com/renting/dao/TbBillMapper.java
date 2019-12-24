package com.renting.dao;

import com.renting.entity.TbBill;

public interface TbBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbBill record);

    int insertSelective(TbBill record);

    TbBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbBill record);

    int updateByPrimaryKey(TbBill record);
}