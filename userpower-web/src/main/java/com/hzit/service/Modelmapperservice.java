package com.hzit.service;

import com.hzit.dao.entity.Model;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public interface Modelmapperservice {
    public List<Model> find(Map map);
}
