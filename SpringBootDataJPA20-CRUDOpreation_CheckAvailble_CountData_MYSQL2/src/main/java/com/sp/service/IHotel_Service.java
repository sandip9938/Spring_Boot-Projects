package com.sp.service;

import com.sp.entity.Hotel;

public interface IHotel_Service {
	public String registerHotel(Hotel hotel);
	public boolean checkAvailabality(int id);
	public long countData();
}
