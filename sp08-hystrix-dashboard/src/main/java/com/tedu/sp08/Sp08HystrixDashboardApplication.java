package com.tedu.sp08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @version 创建时间：2019/11/28 0028 15:50
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class Sp08HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sp08HystrixDashboardApplication.class,args);
    }
}
