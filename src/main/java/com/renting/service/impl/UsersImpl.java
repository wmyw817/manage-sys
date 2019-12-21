package com.renting.service.impl;

import com.renting.dao.UserMapper;
import com.renting.entity.User;
import com.renting.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersImpl implements Users {
    @Autowired
    UserMapper usermapper;

    @Override
    public User selectAllInfo() {

        return usermapper.selectAllInfo();
    }

    @Override
    public User UserInfo(String uname) {
        User user = usermapper.selectByAccount(uname);
        if (user!=null) {
            return user;
        }
        return user;
    }
}
