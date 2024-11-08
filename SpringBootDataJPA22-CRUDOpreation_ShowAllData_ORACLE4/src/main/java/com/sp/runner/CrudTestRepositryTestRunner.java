package com.sp.runner;

import java.util.List;

//Page-5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.entity.Hotel;
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
//		try {
//			System.out.println("Hotel Count in KsNagar: " + hotelinfoService.showHotelCount());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// BULK REGISTER HOTEL
		Hotel hotel1 = new Hotel(null, "Rama Hotel", "RamaBabu", "BAM", (long) 90909090);
		Hotel hotel2 = new Hotel(null, "Sama Hotel", "daamaBabu", "BAM", (long) 90909091);
		Hotel hotel3 = new Hotel(null, "Dama Hotel", "kamaBabu", "BAM", (long) 90909092);
		Hotel hotel4 = new Hotel(null, "Kama Hotel", "RdmaBabu", "BAM", (long) 909090903);
		Hotel hotel5 = new Hotel(null, "Lama Hotel", "RamaBabu", "BAM", (long) 909090904);
		Hotel hotel6 = new Hotel(null, "Jama Hotel", "hmaBabu", "BAM", (long) 90909095);
		Hotel hotel7 = new Hotel(null, "oama Hotel", "RamaBabu", "BAM", (long) 90909096);
		Hotel hotel8 = new Hotel(null, "Mama Hotel", "kaBabu", "BAM", (long) 90909097);
		Hotel hotel9 = new Hotel(null, "Vama Hotel", "oamaBabu", "BAM", (long) 90909098);
		List<Hotel> list = List.of(hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel9);
		try {
			String msg = hotelinfoService.registerHotel(list);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}