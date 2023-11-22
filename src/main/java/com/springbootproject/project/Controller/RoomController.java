package com.springbootproject.project.Controller;

import com.springbootproject.project.Model.Contact;
import com.springbootproject.project.Model.Room;
import com.springbootproject.project.Repository.RoomRepo;
import com.springbootproject.project.ServiceImplement.RoomServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Room")
@CrossOrigin(origins="http://localhost:4200")
public class RoomController {
    @Autowired
    RoomServiceImplement RoomService;
    @Autowired
    RoomRepo roomRepo;

    @PostMapping("/add")
    public ResponseEntity<Room> add(@RequestBody Room rm) {
        Room newRoom= RoomService.addRoom(rm);
        return new ResponseEntity<>(rm, HttpStatus.CREATED);
    }
}
