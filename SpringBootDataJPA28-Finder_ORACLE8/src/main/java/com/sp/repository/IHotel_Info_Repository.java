package com.sp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sp.entity.Hotel;

public interface IHotel_Info_Repository extends JpaRepository<Hotel, Integer> {

    // Corrected method names
    public List<Hotel> findByHotelName(String hotelName);

    public List<Hotel> readByHotelName(String hotelName);

    public List<Hotel> getByHotelName(String hotelName);

    public List<Hotel> findByHotelNameStartingWith(String firstChar);

    public List<Hotel> findByHotelNameEndingWith(String lastChar);

    public List<Hotel> findByHotelNameContaining(String Char);
}

