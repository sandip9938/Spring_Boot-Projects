package com.sp.service;
import java.util.List;
import java.util.Optional;

//Page-3
import com.sp.entity.Hotel;

public interface IHotel_Service {
	public String registerHotel(Hotel hotel);
	public boolean checkHotelAvailability(int id);
	public long showHotelCount();
	public String registerHotel(List<Hotel>list);
	public Iterable<Hotel> showAllData();
	public Iterable<Hotel> showHotelById(Iterable<Integer>id);
	public Optional<Hotel> showHotelById(int id);
	public String getHotelId(int id);
	//Register and Update
	public String registerORupdateData(Hotel hotel);
	
}
