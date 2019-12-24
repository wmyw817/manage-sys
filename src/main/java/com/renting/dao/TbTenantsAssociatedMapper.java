package com.renting.dao;

import com.renting.entity.TbTenantsAssociated;

public interface TbTenantsAssociatedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTenantsAssociated record);

    int insertSelective(TbTenantsAssociated record);

    TbTenantsAssociated selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTenantsAssociated record);

    int updateByPrimaryKey(TbTenantsAssociated record);
}