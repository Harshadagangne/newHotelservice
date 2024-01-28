package com.hotel.services;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel get(String id);

	Hotel deleteHotel(String hotelId);
	
	
	//Hotel updateHotel(String hotelId, Hotel hotel);

	//Hotel updateHotel(Hotel hotel, String hotelId);

	Hotel updateHotel(int hotelId, Hotel hotel);

	//Hotel Hotel(HotelService hotelService, String hotelId);
}
