package com.springbootproject.project.ServiceImplement;

import com.springbootproject.project.Model.Room;
import com.springbootproject.project.Repository.RoomRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoomServiceImplement {
    @Autowired
    private RoomRepo repository;

    public Room addRoom(Room rm)
    {
        return  repository.save(rm);
    }
}
