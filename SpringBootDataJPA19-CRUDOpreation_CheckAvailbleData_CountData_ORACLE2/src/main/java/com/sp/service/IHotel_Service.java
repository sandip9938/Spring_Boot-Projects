package com.sp.service;
//Page-3
import com.sp.entity.Hotel;

public interface IHotel_Service {
	public String registerHotel(Hotel hotel);
	public boolean checkHotelAvailability(int id);
	public long showHotelCount();
}
