package com.mikal.nepwebhms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NepWebHmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NepWebHmsApplication.class, args);
	}

}
