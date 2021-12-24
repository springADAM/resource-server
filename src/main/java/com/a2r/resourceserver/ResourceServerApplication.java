package com.a2r.resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ResourceServerApplication {

    @GetMapping("/api/v1/hello")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(ResourceServerApplication.class, args);
    }

}
