package com.sp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties.ShowSummary;
import org.springframework.stereotype.Component;
import com.sp.repository.IHotel_Info_Repository;

@Component
public class JPA_Query_TestRunner implements CommandLineRunner {

	@Autowired
	private IHotel_Info_Repository iHotel_Info_Repository;

	@Override
	public void run(String... args) throws Exception {
		// Corrected method calls
		// Show All Data
		iHotel_Info_Repository.showAllHotel().forEach(System.out::println);
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		// Show Data Only One Location One value
		iHotel_Info_Repository.showHotelByPlace("BAM").forEach(System.out::println);
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		// Show Data multiple Location Multiole Value
		iHotel_Info_Repository.showHotelByLocation("BAM", "606 Heritage Lane, Agra, Uttar Pradesh")
				.forEach(System.out::println);

		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		// Show Hotel name by Intial Charcter
		iHotel_Info_Repository.showHotelNameByFirstLetter("B%").forEach(System.out::println);
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");

		// Show Unqie Hotel Number
//		System.out.println("Uniqe Hotel Count:: " + iHotel_Info_Repository.showUniqeHotelCount());
//
//		System.out.println("**************************************");
//		System.out.println("**************************************");
//		System.out.println("**************************************");
//		System.out.println("**************************************");
//		// Show Total Hotel Number
//		System.out.println("Total Hotel Count::" + iHotel_Info_Repository.showTotalHotelCount());

		// Deleted Data
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		System.out.println("**************************************");
		int count = iHotel_Info_Repository.deleteHotelByAddr("BAM");
		System.out.println("Total Deleted Hotel Number: " + count);
	}
}
