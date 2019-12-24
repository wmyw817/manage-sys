package com.renting.dao;

import com.renting.entity.TbRoomsCheck;

public interface TbRoomsCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRoomsCheck record);

    int insertSelective(TbRoomsCheck record);

    TbRoomsCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbRoomsCheck record);

    int updateByPrimaryKey(TbRoomsCheck record);
}