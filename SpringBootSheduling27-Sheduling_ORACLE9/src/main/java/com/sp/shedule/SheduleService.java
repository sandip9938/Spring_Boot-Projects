package com.sp.shedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("shedule")
public class SheduleService {

	// @Scheduled(fixedDelayString = "4000")
	@Scheduled(fixedRate = 4000, initialDelay = 200)
	public void generateReport() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Sales Report:: " + new Date());
	}

}
