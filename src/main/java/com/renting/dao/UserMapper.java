package com.renting.dao;

import com.renting.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectAllInfo();

    User selectByAccount(String uname);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}