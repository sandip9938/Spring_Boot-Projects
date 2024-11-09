package com.sp.shedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("shedule")
public class SheduleService {

	@Scheduled(initialDelay = 2000, fixedDelay = 3000)
	public void generateReport() {
		System.out.println("Report Date :: " + new Date());
	}

}
