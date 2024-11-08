package com.sp.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component("dc")
@Data
public class DiagonosticCenter {
	
	@Value("${dc.xrayPrice}")
	private double xrayPrice;
	@Value("${dc.ctScanPrice}")
	private double ctScanPrice;
	@Value("${dc.mriScanPrice}")
	private double mriScanPrice;
	@Value("${dc.ecgPrice}")
	private double ecgPrice;
	

}
