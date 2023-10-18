package com.priyanka.HotelManagement.repo;

import com.priyanka.HotelManagement.model.Room;
import com.priyanka.HotelManagement.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRoomRepo extends CrudRepository<Room,Integer> {

    List<Room> findByRoomPrice(double price);

    List<Room> findByRoomPriceLessThanEqualAndRoomAvailable(double price, boolean b);

    List<Room> findByRoomPriceLessThanEqualOrRoomAvailable(double price, boolean b);

    List<Room> findByRoomTypeOrRoomAvailableOrderByRoomPrice(Type type, boolean b);
}

