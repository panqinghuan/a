package com.tedu.sp03;

/**
 * @version 创建时间：2019/11/27 0027 14:32
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Sp03UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sp03UserServiceApplication.class, args);
    }
}
