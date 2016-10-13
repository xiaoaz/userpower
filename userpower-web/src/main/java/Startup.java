import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/10/13.
 */
@SpringBootApplication
@ComponentScan({"com.fc","com.hzit.controller","com.hzit.service"})
@MapperScan("com.hzit.dao.mapper")
public class Startup extends SpringBootServletInitializer{

    public static void main(String[] args) {
        System.out.println("启动类");

    }
}
