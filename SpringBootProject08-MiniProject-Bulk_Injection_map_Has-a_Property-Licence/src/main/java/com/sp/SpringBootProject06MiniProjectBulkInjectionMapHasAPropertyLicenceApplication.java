package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sp.sbeans.OwnerContact;

@SpringBootApplication
public class SpringBootProject06MiniProjectBulkInjectionMapHasAPropertyLicenceApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBootProject06MiniProjectBulkInjectionMapHasAPropertyLicenceApplication.class, args);
	OwnerContact ownerContact=ctx.getBean("owner",OwnerContact.class);
	System.out.println(ownerContact);
	
	}

}
