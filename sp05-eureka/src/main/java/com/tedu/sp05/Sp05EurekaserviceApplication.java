package com.tedu.sp05;

/**
 * @version 创建时间：2019/11/27 0027 15:11
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sp05EurekaserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sp05EurekaserviceApplication.class, args);
    }
}
