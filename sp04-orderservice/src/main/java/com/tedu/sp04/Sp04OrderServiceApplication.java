package com.tedu.sp04;

/**
 * @version 创建时间：2019/11/27 0027 14:43
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableEurekaClient
//@SpringBootApplication

@EnableFeignClients
@SpringCloudApplication
public class Sp04OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sp04OrderServiceApplication.class, args);
    }
}