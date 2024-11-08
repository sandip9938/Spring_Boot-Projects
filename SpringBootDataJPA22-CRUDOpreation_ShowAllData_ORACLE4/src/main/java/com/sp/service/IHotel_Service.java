package com.sp.service;
import java.util.List;

//Page-3
import com.sp.entity.Hotel;

public interface IHotel_Service {
	public String registerHotel(Hotel hotel);
	public boolean checkHotelAvailability(int id);
	public long showHotelCount();
	public String registerHotel(List<Hotel>list);
}
