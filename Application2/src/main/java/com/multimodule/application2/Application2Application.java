package com.multimodule.application2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.multimodule.application2.*"})
public class Application2Application {

	public static void main(String[] args) {
		SpringApplication.run(Application2Application.class, args);
	}

}
