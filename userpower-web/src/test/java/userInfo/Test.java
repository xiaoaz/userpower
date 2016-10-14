package userInfo;

import com.hzit.Startapp;
import com.hzit.dao.entity.Userinfo;
import com.hzit.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value=Startapp.class)
public class Test {
    @Autowired
    UserService userService;
    @org.junit.Test
    public void selectOne(){
        Userinfo userinfo=userService.selectOne("诸葛亮", "123");
        System.out.println(userinfo.getUsername());
    }
}
