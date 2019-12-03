package com.tedu.sp07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @version 创建时间：2019/11/27 0027 19:33
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
//@EnableEurekaClient
//@EnableCircuitBreaker
//@SpringBootApplication

@SpringCloudApplication
public class Sp07HystrixApplication {

    //创建RestTemplate对象。并存入spring容器
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {     //RestTemplate:远程调用工具
        SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory();
        f.setConnectTimeout(1000);
        f.setReadTimeout(1000);
        return new RestTemplate(f);
    }

    public static void main(String[] args) {
        SpringApplication.run(Sp07HystrixApplication.class, args);
    }
}
