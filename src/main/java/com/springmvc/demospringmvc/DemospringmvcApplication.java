package com.springmvc.demospringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class DemospringmvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemospringmvcApplication.class, args);

		System.out.println("Hello world Project started");
	}


}
