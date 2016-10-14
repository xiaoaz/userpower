package com.hzit.service.impl;

import com.hzit.dao.entity.Userinfo;
import com.hzit.dao.mapper.UserinfoMapper;
import com.hzit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class UserImpl implements UserService {
    @Autowired
    UserinfoMapper userinfoMapper;
    @Override
    public Userinfo selectOne(String username,String userpwd) {
        Map map=new HashMap();
        map.put("username",username);
        map.put("userpwd",userpwd);
        List<Userinfo> list=userinfoMapper.searchUserinfoByParams(map);
        if (list.size()==1){
            return list.get(0);
        }
        else
        return null;
    }
}
