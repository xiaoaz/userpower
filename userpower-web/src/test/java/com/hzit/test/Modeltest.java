package com.hzit.test;

import com.hzit.Startapp;
import com.hzit.dao.entity.Model;
import com.hzit.service.Modelmapperservice;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value =Startapp.class)
public class Modeltest {
    @Autowired
    private Modelmapperservice modelmapperservice;

    @Test
    public void find(){
      List<Model> list= modelmapperservice.find(null);
        for (Model m:list){
            System.out.println(m.getModelName());

        }
    }
}
