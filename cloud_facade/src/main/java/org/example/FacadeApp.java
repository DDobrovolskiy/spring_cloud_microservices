package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FacadeApp
{
    public static void main(String[] args) {
        SpringApplication.run(FacadeApp.class, args);
    }
}
