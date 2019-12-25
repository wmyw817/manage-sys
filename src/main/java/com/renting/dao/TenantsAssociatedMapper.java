package com.renting.dao;

import com.renting.entity.TenantsAssociated;

public interface TenantsAssociatedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TenantsAssociated record);

    int insertSelective(TenantsAssociated record);

    TenantsAssociated selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TenantsAssociated record);

    int updateByPrimaryKey(TenantsAssociated record);
}