package com.sp.runner;

import java.util.List;

//Page-5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.sp.entity.Hotel;
import com.sp.service.Hotel_infoService;

@Component
public class PageSortingTestRepositryTestRunner implements CommandLineRunner {

	@Autowired
	private Hotel_infoService hotelinfoService;

	@Override
	public void run(String... args) throws Exception {

		// Page and Sorting
//		try {
//			hotelinfoService.showDataBySorting(true, "hotelName").forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// Pagination
//		try {
//			Page<Hotel> page = hotelinfoService.showDataByPage(0, 4);
//			List<Hotel> list = page.getContent();
//			list.forEach(System.out::println);
//			System.out.println("***********************************");
//			System.out.println("Current Page No:: " + page.getNumber());
//			System.out.println("Page Size :: " + page.getSize());
//			System.out.println("Total No Of Page:: " + page.getTotalPages());
//			System.out.println("Is the CurrentPage is FirstPage :: " + page.isFirst());
//			System.out.println("Is the CurrentPage is LastPage :: " + page.isLast());
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}

		// SHOW DATA BY PAGE BY PAGE
		try {
			hotelinfoService.showDataPageByPage(2, true, "hotelId");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
