package com.sp.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.entity.PersonalInfo;
import com.sp.service.Prsonal_Info_MngmtService;

@Component
public class Prsonal_InfoMngmntTestRunner implements CommandLineRunner {

	@Autowired
	private Prsonal_Info_MngmtService prsonal_Info_MngmtService;

	@Override
	public void run(String... args) throws Exception {

		// Register

		try {
			// Correcting the LocalDateTime.of() syntax
			LocalDate dateOfBirth = LocalDate.of(2010, 7, 18);
			LocalTime meetingTime = LocalTime.of(19, 30);
			LocalDateTime futureMeeting = LocalDateTime.of(2016, 1, 20, 13, 30);

			// Creating a PersonalInfo object with corrected parameters
			PersonalInfo personalInfo = new PersonalInfo("Siraj", "9337318660", "Hyderabad", dateOfBirth, meetingTime,
					futureMeeting);

			// Optional: Save or log the object using the service
			prsonal_Info_MngmtService.registerPerson(personalInfo);
			System.out.println("Personal Info saved successfully!");
		} catch (Exception e) {
			System.err.println("Error while creating PersonalInfo: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		// Show Data

		try {
			prsonal_Info_MngmtService.showAllPersonalInfo().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		// Show Total age by id

		try {
			System.out.println("Person age is : " + prsonal_Info_MngmtService.getAgeById(1));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
