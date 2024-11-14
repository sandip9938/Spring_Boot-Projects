package com.sp.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.entity.JobSeeker;
import com.sp.service.JobSeekerMngmtService;

@Component
public class JobSeekerMngmntTestRunner implements CommandLineRunner {

	@Autowired
	private JobSeekerMngmtService jobSeekerMngmtService;

	@Override
	public void run(String... args) throws Exception {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Job Holder Name: ");
			String name = scanner.nextLine();
			System.out.println("Enter Job Holder Designation: ");
			String desg = scanner.nextLine();
			System.out.println("Enter Job Holder PhoneNo: ");
			String phn = scanner.nextLine();
			System.out.println("Enter Job Holder Address: ");
			String addr = scanner.nextLine();
			System.out.println("Enter Job Holder Photo file Path: ");
			String photo = scanner.nextLine();
			System.out.println("Enter Job Holder Resume file Path: ");
			String resume = scanner.nextLine();
			System.out.println("Are you Indian: ");
			boolean indian = scanner.nextBoolean();

			// Convert Photo File Content Into Byte Array
			byte[] photoData;
			try (FileInputStream fileInputStream = new FileInputStream(photo)) {
				photoData = fileInputStream.readAllBytes();
			}

			// Convert Resume File Content Into Character Array
			char[] resumeData;
			try (FileReader fileReader = new FileReader(resume)) {
				File file = new File(resume);
				int length = (int) file.length();
				resumeData = new char[length];
				fileReader.read(resumeData);
			}

			// Prepare Entity Class Object
			JobSeeker jobSeeker = new JobSeeker(name, desg, phn, addr, photoData, resumeData, indian);

			try {
				String msg = jobSeekerMngmtService.jobSeekerRegister(jobSeeker);
				System.out.println(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
