package com.spring.rest.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;

@SpringBootApplication
@EnableAutoConfiguration
public class RestWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWebserviceApplication.class, args);
	}

}
