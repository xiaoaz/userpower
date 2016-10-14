package com.hzit.service.impl;

import com.hzit.dao.entity.Role;
import com.hzit.dao.mapper.RoleMapper;
import com.hzit.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
@Service
public class RoleImpl implements RolesService{
    @Autowired
    RoleMapper roleMapper;

    /*
    *
    * 根据角色id查询对应的角色
    * */
    @Override
    public Role selectOne(int roleId) {
        Map map=new HashMap();
        map.put("roleId",roleId);
        List<Role> list= roleMapper.searchRoleByParams(map);
        if (list.size()==1){
            return list.get(0);
        }else

        return null;
    }
}
