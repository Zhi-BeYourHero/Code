package com.zhi.dachuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhi
 */

@SpringBootApplication
@EnableEurekaClient
public class SelfDrivingEnqueryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SelfDrivingEnqueryServiceApplication.class,args);
    }
}
