package com.renting.dao;

import com.renting.entity.RoomsCheck;

public interface RoomsCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomsCheck record);

    int insertSelective(RoomsCheck record);

    RoomsCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomsCheck record);

    int updateByPrimaryKey(RoomsCheck record);
}