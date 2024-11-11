package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootDataJpa17CrudOpreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpa17CrudOpreationApplication.class, args);
	}

}
