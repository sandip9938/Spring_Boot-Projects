package com.sp.runner;

import java.io.*;
import java.util.Optional;
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

            // INSERT DATA
            System.out.println("Enter Job Holder Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Job Holder Designation: ");
            String desg = scanner.nextLine();
            System.out.println("Enter Job Holder Phone No: ");
            String phn = scanner.nextLine();
            System.out.println("Enter Job Holder Address: ");
            String addr = scanner.nextLine();
            System.out.println("Enter Job Holder Photo file Path: ");
            String photoPath = scanner.nextLine();
            System.out.println("Enter Job Holder Resume file Path: ");
            String resumePath = scanner.nextLine();
            System.out.println("Are you Indian (true/false): ");
            boolean indian = scanner.nextBoolean();

            // Read Photo as Byte Array
            byte[] photoData;
            try (FileInputStream photoStream = new FileInputStream(photoPath)) {
                photoData = photoStream.readAllBytes();
            }

            // Read Resume as Character Array
            char[] resumeData;
            try (FileReader resumeReader = new FileReader(resumePath)) {
                File resumeFile = new File(resumePath);
                resumeData = new char[(int) resumeFile.length()];
                resumeReader.read(resumeData);
            }

            // Create JobSeeker Object
            JobSeeker jobSeeker = new JobSeeker(name, desg, phn, addr, photoData, resumeData, indian);

            // Register JobSeeker
            try {
                String msg = jobSeekerMngmtService.jobSeekerRegister(jobSeeker);
                System.out.println(msg);
            } catch (Exception e) {
                System.err.println("Error while registering Job Seeker: " + e.getMessage());
                e.printStackTrace();
            }

            // Retrieve Data
            System.out.println("Enter Job Holder ID to Retrieve: ");
            int id = scanner.nextInt();
            try {
                Optional<JobSeeker> optional = jobSeekerMngmtService.showByJobHolderDetailsById(id);
                if (optional.isPresent()) {
                    JobSeeker retrievedSeeker = optional.get();
                    System.out.println("Job Holder Details: ");
                    System.out.println("Name: " + retrievedSeeker.getJobHolderName());
                    System.out.println("Designation: " + retrievedSeeker.getJobDesignation());
                    System.out.println("Phone No: " + retrievedSeeker.getJobHolderPhnNo());
                    System.out.println("Address: " + retrievedSeeker.getJobHolderAddr());
                    System.out.println("Indian: " + retrievedSeeker.getJobHolderIndian());

                    // Save Photo and Resume
                    try (FileOutputStream photoOut = new FileOutputStream("photo_retrieved.jpg");
                         FileWriter resumeOut = new FileWriter("resume_retrieved.docx")) {

                        photoOut.write(retrievedSeeker.getJobHolderPhoto());
                        resumeOut.write(retrievedSeeker.getJobHolderResume());
                    }
                    System.out.println("Photo and Resume retrieved successfully.");
                } else {
                    System.out.println("Job Seeker Not Found.");
                }
            } catch (Exception e) {
                System.err.println("Error while retrieving Job Seeker details: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
