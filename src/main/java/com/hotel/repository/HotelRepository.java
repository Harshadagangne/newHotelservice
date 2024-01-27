package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel,String>{

}