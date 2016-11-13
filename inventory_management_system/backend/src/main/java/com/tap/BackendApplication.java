package com.tap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "applicationContext.xml")
public class BackendApplication {

	public static ConfigurableApplicationContext applicationCtxt;
	public static void main(String[] args) {
		applicationCtxt  =SpringApplication.run(BackendApplication.class, args);
	}
}
