package com.sp.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5) // Higher Priority getOrder()
public class Test2 implements ApplicationRunner ,Ordered{

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("***********Test2(APPLICATION)************");
    System.out.println("Option arg names and Values::");
    for(String name:args.getOptionNames())
    {
    	System.out.println(name+"--->"+args.getOptionValues(name));
    }

	}

	@Override
	public int getOrder() {
		// Higher Priority getOrder()
		return 5;
	}

}
