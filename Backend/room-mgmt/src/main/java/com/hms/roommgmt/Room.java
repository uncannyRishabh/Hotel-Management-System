package com.hms.roommgmt;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(collection = "Rooms")
public class Room {
    @Id
    @NotNull(message="Room ID cannnot be null")
    @Size(min=8,message="Room ID should be minimum 8 digits")
    long roomId;
    @NotNull(message="Room type be null")
    @Size(min=11,message="Room type be minimum 11 digits")
    String roomType;
    @NotNull(message="Room rent cannnot be null")
    @Size(min=4,message="Room rent should be minimum 4 digits")
    double roomRent;
    @NotNull(message="Room avaialble cannnot be null")
    @Size(min=5,message="Room available should be minimum 5 digits and should be either 'True' or 'False'")
    boolean roomAvailability;

    public Room(){}

    public Room(@NotNull(message="Room ID cannnot be null")@Size(min=8,message="Room ID should be minimum 8 digits")long roomId,
                @NotNull(message="Room type be null")@Size(min=11,message="Room type be minimum 11 digits")String roomType,
                @NotNull(message="Room rent cannnot be null")@Size(min=4,message="Room rent should be minimum 4 digits")double roomRent,
                @NotNull(message="Room avaialble cannnot be null")@Size(min=5,message="Room available should be minimum 5 digits and should be either 'True' or 'False'")boolean roomAvailability) {
//        super();
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomRent = roomRent;
        this.roomAvailability = roomAvailability;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }


    @Override
    public String toString() {
        return "Room [roomId=" + roomId + ", roomType=" + roomType + ", roomRent=" + roomRent
                + ", roomAvailability=" + roomAvailability + "]";
    }
}
