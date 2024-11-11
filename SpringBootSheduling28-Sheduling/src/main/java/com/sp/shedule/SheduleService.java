package com.sp.shedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("shedule")
public class SheduleService {

	// @Scheduled(fixedDelayString = "4000")
	// @Scheduled(fixedRate = 4000, initialDelay = 200)
	// @Scheduled(cron = "* * * * * *")
	// @Scheduled(cron = "2 * * * * *")
	// @Scheduled(cron = "2 1 * * * *")
	// @Scheduled(cron = "0 5 3 * * *")
	// @Scheduled(cron = "0 5 18 * * *")
	// @Scheduled(cron = "3 10 20 30 * *")
	// @Scheduled(cron = "3 10 20 30 11 *")
	// @Scheduled(cron = "3 10 20 10 11 3")
	// @Scheduled(cron = "3 10/11 20 10 11 3")
	// @Scheduled(cron = "3/2 10/11 20 10 11 3")
	// @Scheduled(cron = "3/1 10/11 20/22 10 11 3")
	// @Scheduled(cron = "3 10 20 * 11 3")
	// @Scheduled(cron = "0 0 12 15 8 *")
	@Scheduled(cron = "@hourly")
	public void generateReport() {
//		try {
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Sales Report:: " + new Date());
	}

}
