package com.sp.repository;

//Page-2
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sp.entity.Hotel;

public interface IHotel_Info_Repository
		extends CrudRepository<Hotel, Integer>, PagingAndSortingRepository<Hotel, Integer> {

}
