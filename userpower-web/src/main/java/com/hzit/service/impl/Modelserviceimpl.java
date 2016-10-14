package com.hzit.service.impl;

import com.hzit.dao.entity.Model;
import com.hzit.service.Modelmapperservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */

public class Modelserviceimpl implements Modelmapperservice {
    @Autowired
    private Modelmapperservice modelmapperservice;
    @Override
    public List<Model> find(Map map) {
        List<Model> list=modelmapperservice.find(null);
        return list;
    }
}
