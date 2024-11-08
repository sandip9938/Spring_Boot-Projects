package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sp.sbeans.Hotel;

@SpringBootApplication
public class SpringBootProject05MiniProjectValueInjection1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBootProject05MiniProjectValueInjection1Application.class, args);
		Hotel hotel=ctx.getBean("hotell",Hotel.class);
		System.out.println(hotel);
	}

}
