package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
//@EnableZuulServer
public class SpringGatewayZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayZuulDemoApplication.class, args);
	}
}
