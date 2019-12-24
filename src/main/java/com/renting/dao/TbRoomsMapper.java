package com.renting.dao;

import com.renting.entity.TbRooms;

public interface TbRoomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRooms record);

    int insertSelective(TbRooms record);

    TbRooms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbRooms record);

    int updateByPrimaryKey(TbRooms record);
}