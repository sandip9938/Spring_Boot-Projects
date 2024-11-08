package com.sp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

	// SHOW ALL DATA
	@Override
	public Iterable<Hotel> showAllData() {
		Iterable<Hotel> list = ihotelrepo.findAll();
		return list;
	}

	// SHOW DATA BY ID NAME USING ITERABLE
	@Override
	public Iterable<Hotel> showHotelById(Iterable<Integer> id) {
		Iterable<Hotel> list = ihotelrepo.findAllById(id);
		return list;
	}

	// SHOW DATA BY ID NAME USING OPTIONAL
	@Override
	public Optional<Hotel> showHotelById(int id) {
		Optional<Hotel> list = ihotelrepo.findById(id);
		return list;
	}

	// SHOW DATA BY ID NAME
	@Override
	public String getHotelId(int id) {
		Optional<Hotel> list = ihotelrepo.findById(id);
		if (list.isEmpty())
			return "Hotel Information Not Found";
		else
			return "Hotel Information Found :: " + list.get();
	}

	// REGISTER OR UPDATE DATA(1)
//	@Override
//	public String registerORupdateData(Hotel hotel) {
//		ihotelrepo.save(hotel);
//		return hotel.getHotelName() + " Hotel updated.. ";
//	}

	// REGISTER OR UPDATE DATA(1)
	@Override
	public String registerORupdateData(Hotel hotel) {
		ihotelrepo.save(hotel);
		if (ihotelrepo.existsById(hotel.getHotelId()))
			return hotel.getHotelName() + " Hotel is updated";
		else
			return hotel.getHotelName() + "Hotel is not updated";
	}

}
