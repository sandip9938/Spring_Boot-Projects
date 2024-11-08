package com.sp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

	@Override
	public boolean checkHotelAvailability(int id) {
		@SuppressWarnings("unused")
		boolean flag = ihotelrepo.existsById(id); // Check The ID
		return flag;
	}

	// COUNT DATA
	@Override
	public long showHotelCount() {
		return ihotelrepo.count();
	}

// BULK REGISTER HOTEL(METHOD-1)NORAML
//	@Override
//	public String registerHotel(List<Hotel> list) {
//
//		Iterable<Hotel> hotelist = ihotelrepo.saveAll(list);
//		List<Integer> idList = new ArrayList();
//		hotelist.forEach(hotel -> {
//			idList.add(hotel.getHotelId());
//		});
//		return idList.size() + "No of Hotel are  registered having id values " + idList.toString();
//	}

	// BULK REGISTER HOTEL(METHOD-2)INDUSTRY LEVEL
	@Override
	public String registerHotel(List<Hotel> list) {
		List<Hotel> hotelList = (List<Hotel>) ihotelrepo.saveAll(list);
		List<Integer> idList = hotelList.stream().map(hotel -> hotel.getHotelId()).collect(Collectors.toList());
		return idList.size() + " No of Hotels are registered having id values " + idList;
	}

}
