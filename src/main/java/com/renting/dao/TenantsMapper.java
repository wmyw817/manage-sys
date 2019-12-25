package com.renting.dao;

import com.renting.entity.Tenants;

public interface TenantsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tenants record);

    int insertSelective(Tenants record);

    Tenants selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tenants record);

    int updateByPrimaryKey(Tenants record);
}