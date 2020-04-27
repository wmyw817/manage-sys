package com.renting.service;

import com.renting.entity.User;

public interface Users {
    /**
     * 修改一
     * @return
     */
    public User selectAllInfo();
    public User UserInfo(String uname);
}
