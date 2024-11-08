package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sp.sbeans.Information;

@SpringBootApplication
public class SpringBootProject06MiniProjectValueInjection2DiagonosticApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(SpringBootProject06MiniProjectValueInjection2DiagonosticApplication.class, args);
		Information information = ctx.getBean("info", Information.class);
		System.out.println(information);
		((ConfigurableApplicationContext) ctx).close();
	}

}
