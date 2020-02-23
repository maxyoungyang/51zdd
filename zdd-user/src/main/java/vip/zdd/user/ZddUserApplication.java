package vip.zdd.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "vip.zdd.user.mapper")
public class ZddUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZddUserApplication.class, args);
    }

}
