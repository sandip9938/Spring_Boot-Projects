package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sp.sbeans.Company;

@SpringBootApplication
public class SpringBootProject05MiniProjectValueInjection1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProject05MiniProjectValueInjection1Application.class,
				args);
		Company company = ctx.getBean("company", Company.class);
		System.out.println(company);
	}

}
