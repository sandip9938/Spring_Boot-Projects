package com.sp.runner;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Page-5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.sp.entity.Hotel;
import com.sp.service.Hotel_infoService;

@Component
public class JPATestRepositryTestRunner implements CommandLineRunner {

	@Autowired
	private Hotel_infoService hotelinfoService;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			String msgString = hotelinfoService.removeDataById(Arrays.asList(1061,     1060));
//			System.out.println(msgString);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			List<Hotel> list = hotelinfoService.searchDataByGivenData("Dama Hotel", "BAM");
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Optional<Hotel>optional=hotelinfoService.fetchHotelById(17);
			if(optional.isEmpty())
			{
				System.out.println("Hotel Not Found...");
			}
			else {
				System.out.println("Hotel Found: "+optional.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Hotel hotel = hotelinfoService.loadHotelById(16);
			System.out.println("proxy object class name:: "+hotel.getClass()+" Super class :: "+hotel.getClass().getSuperclass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
