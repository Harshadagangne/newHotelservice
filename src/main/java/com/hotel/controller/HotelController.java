package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.impl.HotelServiceImple;

import com.hotel.entities.Hotel;

@RestController
//@RequestMapping("/hotels")
public class HotelController {

	// @Autowired
	  //  private HotelService hotelService;
	 @Autowired
	  private HotelServiceImple hotelServiceimpl;
	 
	//create
	 @PostMapping("/saveHotels")
	    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		 Hotel savedHotel = hotelServiceimpl.create(hotel);
			return new ResponseEntity<>(savedHotel,HttpStatus.CREATED);
	    }
	 
	 //get single
	  @GetMapping("/{hotelId}")
	    public ResponseEntity<Hotel> createHotel(@PathVariable String hotelId) {
	        return ResponseEntity.status(HttpStatus.OK).body(hotelServiceimpl.get(hotelId));
	    }

	 
	 //get all
	 
	 
	  @GetMapping("/all")
	    public ResponseEntity<List<Hotel>> getAll(){
	        return ResponseEntity.ok(hotelServiceimpl.getAll());
	    }
	 
	
	
	@PutMapping("/{hotelId}")
	public ResponseEntity<Hotel> updateHotel(@PathVariable("hotelId")int hotelId,
			@RequestBody Hotel hotel) {
		hotel.setId(hotelId);
	 
	 Hotel updateHotel = hotelServiceimpl.updateHotel(hotelId,hotel);
	 return new ResponseEntity<>(updateHotel,HttpStatus.OK);
	 
	  
			}
	
	@DeleteMapping("/{hotelId}")
	 public ResponseEntity<Hotel> deleteHotel(@PathVariable String hotelId) {
		 return ResponseEntity.status(HttpStatus.OK).body(hotelServiceimpl.deleteHotel(hotelId));
	}

	@GetMapping("/h")
	public String hello(){
		return "Hello World";
	}
}
