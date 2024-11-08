package com.sp.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // Higher Priority getOrder()
public class Test implements CommandLineRunner , Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("***********Test1(COMMANDLINE)************");
		 System.out.println("NonOption arg names and Values::");
		System.out.println("Result: "+Arrays.toString(args));

	}

	@Override
	public int getOrder() {
		// Higher Priority getOrder()
		return 10;
	}

}
