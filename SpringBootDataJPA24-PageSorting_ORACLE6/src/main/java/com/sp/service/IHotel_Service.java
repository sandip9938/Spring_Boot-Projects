package com.sp.service;

import org.springframework.data.domain.Page;


//Page-3
import com.sp.entity.Hotel;

public interface IHotel_Service {
	// Paging And Sorting
	public Iterable<Hotel> showDataBySorting(Boolean assOrder,String...props);
	public Page<Hotel> showDataByPage(int pageno,int pagesize);
	public void showDataPageByPage(int pageSize,boolean asOrder,String...props);
	
	
}
