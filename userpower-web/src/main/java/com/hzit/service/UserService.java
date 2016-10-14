package com.hzit.service;

import com.hzit.dao.entity.Userinfo;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface UserService {
    public Userinfo selectOne(String username,String userpwd);
}
