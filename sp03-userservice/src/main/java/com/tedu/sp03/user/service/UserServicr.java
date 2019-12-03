package com.tedu.sp03.user.service;

import com.tedu.sp01.pojo.User;

public interface UserServicr {
    User getUser(Integer id);
    void addScore(Integer id, Integer score);
}
