package com.hms.roommgmt;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoomService {

    void addRoom(Room room);

    List<Room> getAllRoom();

    Optional<Room> getRoomById(long roomId);

    void updateRoom(long roomId,Room room);

    void deleteRoom(long roomId);

    public List<Room> getAvailableRoom(boolean roomAvailable);
}