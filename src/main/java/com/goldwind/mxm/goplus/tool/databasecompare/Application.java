package com.goldwind.mxm.goplus.tool.databasecompare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by alex on 2017/11/23.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
