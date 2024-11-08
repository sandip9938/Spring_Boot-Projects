package com.sp.service;

import java.util.List;
import java.util.Optional;

import com.sp.entity.Hotel;

//Page-3
public interface IHotel_Service {

	public String removeDataById(List<Integer> ids);

	public List<Hotel> searchDataByGivenData(String name, String addres);
	public Optional<Hotel> fetchHotelById(int id);
	public Hotel loadHotelById(int id);
}
