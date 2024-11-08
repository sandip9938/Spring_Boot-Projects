package com.sp.service;

import java.util.List;
import java.util.Optional;

//Page-4
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.PageRequest;

import com.sp.entity.Hotel;
import com.sp.repository.IHotel_Info_Repository;

@Service("hotelService")
public class Hotel_infoService implements IHotel_Service {

	@Autowired
	private IHotel_Info_Repository ihotelrepo;

	// Remove Data By Id
	@Override
	public String removeDataById(List<Integer> ids) {
		// Load object by Id
		List<Hotel> list = ihotelrepo.findAllById(ids);
		// Delete Object By Id
		ihotelrepo.deleteAllByIdInBatch(ids);
		return list.size() + " Records deleted";
	}

	// Search Data By Given User Data
	@Override
	public List<Hotel> searchDataByGivenData(String name, String addres) {
		// Prepare Object
		Hotel hotel = new Hotel();
		hotel.setHotelName(name);
		hotel.setHotelAddr(addres);

		// Prepare Example Object
		Example<Hotel> example = Example.of(hotel);

		// Excute the logic
		List<Hotel> list = ihotelrepo.findAll(example);
		return list;
	}

	@Override
	public Optional<Hotel> fetchHotelById(int id) {
		return ihotelrepo.findById(id);
	}

	@Override
	public Hotel loadHotelById(int id) {
		return ihotelrepo.getReferenceById(id);
	}

}
