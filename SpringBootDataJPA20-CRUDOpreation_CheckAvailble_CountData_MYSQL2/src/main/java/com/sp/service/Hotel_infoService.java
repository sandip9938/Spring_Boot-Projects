package com.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.entity.Hotel;
import com.sp.repository.IHotel_Info_Repository;

@Service("hotelService")
public class Hotel_infoService implements IHotel_Service {

	@Autowired
	private IHotel_Info_Repository ihotelrepo;

	@Override
	public String registerHotel(Hotel hotel) {
		@SuppressWarnings("unused")
		Hotel hotel1 = ihotelrepo.save(hotel);
		return hotel.getHotelId() == null ? "Hotel Information is not Saved(Record Not Inserted)"
				: "Hotel Information is Saved(Record Inserted)";
	}

	@Override
	public boolean checkAvailabality(int id) {
		boolean flag=ihotelrepo.existsById(id);
		return flag;
	}

	@Override
	public long countData() {
		return ihotelrepo.count();
	}

}
