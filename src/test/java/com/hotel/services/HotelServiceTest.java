package com.hotel.services;

import com.hotel.entities.Hotel;
import com.hotel.impl.HotelServiceImple;
import com.hotel.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.BDDMockito;
import static org.mockito.BDDMockito.*;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class HotelServiceTest {

    @Mock
    private HotelRepository hotelRepository;

    @InjectMocks
    private HotelServiceImple hotelServiceimpl;

    @Test
    void createHotel(){
        Hotel GreatIndian = new Hotel(1,"Great Indian Hotel",23456,true,6);

        given(hotelRepository.findById("1")).willReturn(Optional.of(GreatIndian));

        var hotel = hotelServiceimpl.get("1");
    }


}
