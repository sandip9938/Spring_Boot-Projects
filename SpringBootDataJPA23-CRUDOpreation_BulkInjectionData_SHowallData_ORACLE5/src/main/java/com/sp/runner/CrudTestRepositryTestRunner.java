package com.sp.runner;

import java.security.Identity;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.hibernate.property.access.spi.EnhancedSetterImpl;
//Page-5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.entity.Hotel;
import com.sp.service.Hotel_infoService;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;

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
//		Hotel hotel1 = new Hotel(null, "Rama Hotel", "RamaBabu", "BAM", (long) 90909090);
//		Hotel hotel2 = new Hotel(null, "Sama Hotel", "daamaBabu", "BAM", (long) 90909091);
//		Hotel hotel3 = new Hotel(null, "Dama Hotel", "kamaBabu", "BAM", (long) 90909092);
//		Hotel hotel4 = new Hotel(null, "Kama Hotel", "RdmaBabu", "BAM", (long) 909090903);
//		Hotel hotel5 = new Hotel(null, "Lama Hotel", "RamaBabu", "BAM", (long) 909090904);
//		Hotel hotel6 = new Hotel(null, "Jama Hotel", "hmaBabu", "BAM", (long) 90909095);
//		Hotel hotel7 = new Hotel(null, "oama Hotel", "RamaBabu", "BAM", (long) 90909096);
//		Hotel hotel8 = new Hotel(null, "Mama Hotel", "kaBabu", "BAM", (long) 90909097);
//		Hotel hotel9 = new Hotel(null, "Vama Hotel", "oamaBabu", "BAM", (long) 90909098);
//		List<Hotel> list = List.of(hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel9);
//		try {
//			String msg = hotelinfoService.registerHotel(list);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// SHOW ALL DATA
//		try {
//			Iterable<Hotel> listIterable = hotelinfoService.showAllData();
//			listIterable.forEach(hotel -> {
//				System.out.println(hotel);
//			});
//			System.out.println("*********************************");
//			listIterable.forEach(hotel -> System.out.println(hotel));
//			System.out.println("*********************************");
//			listIterable.forEach(System.out::println);
//			System.out.println("*********************************");
//			for (Hotel hotel : listIterable) {
//				System.out.println(hotel);
//			}
//			System.out.println("*********************************");
//			Stream.of(listIterable).forEach(System.out::println);
//			System.out.println("*********************************");
//			Stream.of(listIterable).forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// SHOW SPECIFIC DATA BY ID (1)

//		try {
//		hotelinfoService.showHotelById(List.of(1,1000,1001,1024,1027,1029,1025,1030)).forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// SHOW SPECIFIC DATA BY ID (2)
//		try {
//			Optional<Hotel> optional = hotelinfoService.showHotelById(1);
//			if (optional.isPresent()) {
//				Hotel hotel = optional.get();
//				System.out.println("Hotel Info is ::" + hotel);
//			} else {
//				System.out.println("Hotel Information Not Found");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// SHOW SPECIFIC DATA BY ID (3)
//		try {
//			System.out.println(hotelinfoService.getHotelId(1001));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// REGISTER OR UPDATE DATA(1)
//		try {
//			Hotel hotel = new Hotel(null,"Rameswari Hotel","jama Bhaina","BBSR",(long)909183748);
//			String msgString=hotelinfoService.registerHotel(hotel);
//			System.out.println(msgString);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// Delete Data
//		try {
//			System.out.println(hotelinfoService.removeDataById(11));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		

//		// Delete all Data 
//		try {
//			System.out.println(hotelinfoService.removeAllDataById());
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// Remove data By Specific DATA
		try {
			System.out.println(" Hotel deleted Are " + hotelinfoService.removeDataByIds(Arrays.asList(10, 11, 12, 40)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
