package com.tedu.sp11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @version 创建时间：2019/12/2 0002 10:55
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Sp11ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sp11ZuulApplication.class, args);
    }
}
