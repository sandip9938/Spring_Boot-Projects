package com.sp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sp.repository.IHotel_Info_Repository;

@Component
public class JPA_Finder_TestRunner implements CommandLineRunner {

    @Autowired
    private IHotel_Info_Repository iHotel_Info_Repository;

    @Override
    public void run(String... args) throws Exception {
        // Corrected method calls
        iHotel_Info_Repository.findByHotelName("Dama Hotel").forEach(System.out::println);
        System.out.println("************************************");
        iHotel_Info_Repository.getByHotelName("Dama Hotel").forEach(System.out::println);
        System.out.println("************************************");
        iHotel_Info_Repository.readByHotelName("Dama Hotel").forEach(System.out::println);
        System.out.println("************************************");
        iHotel_Info_Repository.findByHotelNameStartingWith("D").forEach(System.out::println);
        System.out.println("************************************");
        iHotel_Info_Repository.findByHotelNameEndingWith("l").forEach(System.out::println);
        System.out.println("************************************");
        iHotel_Info_Repository.findByHotelNameContaining("a").forEach(System.out::println);
        System.out.println("************************************");
    }
}

