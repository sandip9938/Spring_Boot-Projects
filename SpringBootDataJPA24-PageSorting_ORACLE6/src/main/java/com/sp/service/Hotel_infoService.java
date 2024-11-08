package com.sp.service;

//Page-4
import org.springframework.beans.factory.annotation.Autowired;
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

	// SORTING
	@Override
	public Iterable<Hotel> showDataBySorting(Boolean assOrder, String... props) {
		// Prepare Sort Object
		Sort sort = Sort.by(assOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);
		// Invoke The Method
		return ihotelrepo.findAll(sort);
	}

	// PAGINATION
	@Override
	public Page<Hotel> showDataByPage(int pageno, int pagesize) {
		// Prepare Pageable input
		Pageable pageable = PageRequest.of(pageno, pagesize);

		// Fetch paginated data from repository
		Page<Hotel> page = ihotelrepo.findAll(pageable);

		return page;
	}

	// SHOW DATA BY PAGE BY PAGE
	@Override
	public void showDataPageByPage(int pageSize, boolean asOrder, String... props) {
		// Get Record count
		long count = ihotelrepo.count();
		long pageCount = count / pageSize;
		if (count % pageSize != 0) {
			pageCount = ++pageCount;
		}
		Sort sort = Sort.by(asOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);
		for (int i = 0; i < pageCount; ++i) {
			// Preparable Pageable object
			Pageable pageable = PageRequest.of(i, pageSize);
			// Get each page Record
			Page<Hotel> page = ihotelrepo.findAll(pageable);
			// Display Each Page
			page.forEach(System.out::println);
			System.out.println("************" + page.getNumber() + 1 / page.getTotalPages() + "**********************");

		}
	}

}
