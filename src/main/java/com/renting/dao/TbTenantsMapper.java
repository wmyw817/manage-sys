package com.renting.dao;

import com.renting.entity.TbTenants;

public interface TbTenantsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTenants record);

    int insertSelective(TbTenants record);

    TbTenants selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTenants record);

    int updateByPrimaryKey(TbTenants record);
}