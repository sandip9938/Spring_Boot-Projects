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
		Hotel hotel = new Hotel(null, "Sarala Hotel", "Sahoo Sir", "KsNagar", (long) 999306730);

		// Invoke The Business Method

		//INSERT DATA
		try {
			String msg = hotel_infoService.registerHotel(hotel);
		System.out.println(msg);

	} catch (Exception e) {
		e.printStackTrace();
		}
		
		// CHECK AVILBALE DATA 
		try {
			System.out.println("Hotel Vailable(TRUE) or Hotel Not Available(FALSE): "+hotel_infoService.checkAvailabality(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// COUNT DATA 
		try {
			System.out.println("Total Hotel Number in KsNagar: "+hotel_infoService.countData());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
