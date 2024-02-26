package org.example.springeurekav2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaV2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaV2Application.class, args);
    }

}
