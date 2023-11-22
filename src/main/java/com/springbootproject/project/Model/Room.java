package com.springbootproject.project.Model;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoom;
    private Long RoomNumber;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="idCategoryRoom")
    private CategoryRoom ctr;

    public Room() {
    }

    public Long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
    }

    public Long getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        RoomNumber = roomNumber;
    }
}
