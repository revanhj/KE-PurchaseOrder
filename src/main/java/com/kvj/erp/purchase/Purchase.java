package com.kvj.erp.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@PropertySource({ "database.properties" })
public class Purchase {
    public static void main(String[] args) {
        SpringApplication.run(Purchase.class, args);
    }
}
