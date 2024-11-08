package com.sp.service;
//Page-4
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

}
