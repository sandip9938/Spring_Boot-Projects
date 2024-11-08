package com.sp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.entity.Hotel;
import com.sp.service.Hotel_infoService;

@Component
public class CrudTestRepositryTestRunner implements CommandLineRunner {

	@Autowired
	private Hotel_infoService hotel_infoService;

	@Override
	public void run(String... args) throws Exception {
		Hotel hotel = new Hotel(null, "Bhaya Hotel", "Rama Sir", "KsNagar", (long) 999106730);

		// Invoke The Business Method

		try {
			String msg = hotel_infoService.registerHotel(hotel);
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
