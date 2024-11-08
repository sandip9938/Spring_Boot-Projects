package com.sp.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("company")
@Setter
@ToString
@ConfigurationProperties(prefix = "org.sp")
public class Company {

	// Company Details
	private String name;
	private String addr;
	private String pincode;
	private String contact;

}
