package com.sp.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("***********Test2(APPLICATION)************");
    System.out.println("Option arg names and Values::");
    for(String name:args.getOptionNames())
    {
    	System.out.println(name+"--->"+args.getOptionValues(name));
    }

	}

}
