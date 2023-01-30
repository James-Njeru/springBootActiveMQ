package com.multimodule.application1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.multimodule.application1.*"})
public class Application1Application {

	public static void main(String[] args) {
		SpringApplication.run(Application1Application.class, args);
	}

}
