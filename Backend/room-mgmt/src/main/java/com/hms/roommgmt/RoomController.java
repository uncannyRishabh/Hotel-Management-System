package com.hms.roommgmt;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/add")
    @ApiOperation(value = "Adding Room")
    public String addRoom(@RequestBody Room room) {
        try {
            this.roomService.addRoom(room);
            return "Room added with roomNumber "+room.getRoomId();
        } catch (Exception e) {
            System.out.println(e);
            return "Use Valid Input";
        }
    }

    @GetMapping("/get")
    @ApiOperation(value = "Views all Room")
    public List<Room> getAllRooms(){
        try {
            return this.roomService.getAllRoom();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @GetMapping("/get/{roomId}")
    @ApiOperation(value = "Views Specific Room using ID")
    public Optional<Room> getInventoryById(@PathVariable long roomId) {
        try {
            return this.roomService.getRoomById(roomId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @PutMapping("/update/{roomId}")
    @ApiOperation(value = "Upadtes the Room of given ID")
    public String updateRoom(@RequestBody Room room,@PathVariable long roomId) {
        try {
            this.roomService.updateRoom(roomId, room);
            return "Room updated with roomNumber "+roomId;
        } catch (Exception e) {
            System.out.println(e);
            return "Use Valid Input";
        }
    }

    @DeleteMapping("/delete/{roomId}")
    @ApiOperation(value = "Deletes the Inventory of given ID")
    public String deleteRoom(@PathVariable long roomId) {
        try {
            this.roomService.deleteRoom(roomId);
            return "Room deleted with roomNumber "+roomId;
        } catch (Exception e) {
            System.out.println(e);
            return "Use Valid Input";
        }
    }

    @GetMapping("/search/{roomAvailable}")
    @ApiOperation(value = "Searches for Rooms ")
    public List<Room> getAvailableRoom(@PathVariable boolean roomAvailable){
        return this.roomService.getAvailableRoom(roomAvailable);
    }
}
