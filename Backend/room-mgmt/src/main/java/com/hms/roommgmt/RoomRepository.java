package com.hms.roommgmt;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends MongoRepository<Room,Long>{
	
	public List<Room> findByRoomAvailable(boolean roomAvailable);
}
