package com.sp.runner;

//Page-5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sp.service.Hotel_infoService;

@Component
public class CrudTestRepositryTestRunner implements CommandLineRunner {

	@Autowired
	private Hotel_infoService hotelinfoService;

	@Override
	public void run(String... args) throws Exception {

		// INSERT

//		Hotel hotel = new Hotel(null, "Binayak Hotel", "loknath Sir", "KsNagar", (long) 909111730);
//
//		// Invoke The Business Method
//
//		try {
//			String msg = hotel_infoService.registerHotel(hotel);
//			System.out.println(msg);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// CHECK AVAILABILITY

//		try {
//			System.out.println(
//					"Hotel AVailable(TRUE) or not Available(FALSE) : " + hotelinfoService.checkHotelAvailability(1001));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// COUNT DATA
		try {
			System.out.println("Hotel Count in KsNagar: " + hotelinfoService.showHotelCount());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
