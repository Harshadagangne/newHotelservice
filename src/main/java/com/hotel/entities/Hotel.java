package com.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	//private String location;
	//private String about;
	@Column
	private int contactno;
	@Column
	private boolean RoomAvailable;
	@Column
	private int rating;

	public Hotel(int id, String name, int contactno, boolean roomAvailable, int rating) {
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		RoomAvailable = roomAvailable;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public boolean isRoomAvailable() {
		return RoomAvailable;
	}

	public void setRoomAvailable(boolean roomAvailable) {
		RoomAvailable = roomAvailable;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
