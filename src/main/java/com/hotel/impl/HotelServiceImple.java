package com.hotel.impl;

import java.util.List;

import com.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.ResourceNotFoundException;
import com.hotel.services.HotelService;

import com.hotel.entities.Hotel;

@Service
public class HotelServiceImple implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        //String hotelId = UUID.randomUUID().toString();
        //hotel.setId(hotelId);
        return this.hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return this.hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return this.hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!"));
    }

	@Override
	public Hotel deleteHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel updateHotel(int hotelId,Hotel hotel) {
		// TODO Auto-generated method stub
		Hotel existingHotel = this.hotelRepository.findById(String.valueOf(hotelId)).orElseThrow(()->new ResourceNotFoundException("Hotel not found"));
		existingHotel.setId(hotel.getId());
		existingHotel.setContactno(hotel.getContactno());
		existingHotel.setRating(hotel.getRating());
		existingHotel.setRoomAvailable(hotel.isRoomAvailable());
		
		Hotel updatedHotel = this.hotelRepository.save(existingHotel);
		return updatedHotel;
	}


	//@Override
	//public Hotel updateHotel(Hotel hotel, String usedId) {
		// TODO Auto-generated method stub
		//return null;
//	}
}
