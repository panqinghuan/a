package com.tedu.sp10;

/**
 * @version 创建时间：2019/12/2 0002 19:41
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class Sp10TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp10TurbineApplication.class, args);
    }

}