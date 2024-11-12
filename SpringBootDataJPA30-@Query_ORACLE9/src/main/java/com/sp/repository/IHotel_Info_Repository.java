package com.sp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sp.entity.Hotel;

public interface IHotel_Info_Repository extends JpaRepository<Hotel, Integer> {

//	@Query("from Hotel") // Entity Name Not  a Table name
//	@Query("from com.sp.entity.Hotel") // We also add entity package name
	@Query("from Hotel as hotel") // hote is alias name
	public List<Hotel> showAllHotel();

	@Query("from Hotel where hotelAddr=?1") // Here only "?" not allowed here inside write number.
	public List<Hotel> showHotelByPlace(String addr);

	@Query("from Hotel where hotelAddr in(:loc1,:loc2)") // Here Loc1 and Loc2 are data Show
	public List<Hotel> showHotelByLocation(String loc1, String loc2);

	@Query("from Hotel where hotelAddr like :initChar") // Here Hotel location select by its first Charcters
	public List<Hotel> showHotelNameByFirstLetter(String initChar);

	@Query("select count(distinct hotelAddr) from Hotel") // Uniqe Data Hotel Count
	public List<Hotel> showUniqeHotelCount();

	@Query("select count(*) from Hotel") // Here All Hotel name count
	public List<Hotel> showTotalHotelCount();
}
