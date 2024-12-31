package com.jlopez11c.api.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@IntegrationComponentScan
@SpringBootApplication
@EnableIntegration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
