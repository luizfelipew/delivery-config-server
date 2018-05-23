package com.coderef.deliveryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableConfigServer
@SpringBootApplication
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryConfigServerApplication.class, args);
	}
}
