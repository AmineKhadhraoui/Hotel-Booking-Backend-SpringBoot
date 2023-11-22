package com.springbootproject.project.Controller;

import com.springbootproject.project.Model.CategoryRoom;

import com.springbootproject.project.Repository.CategoryRoomRepo;
import com.springbootproject.project.ServiceImplement.CategoryRoomServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/CategoryRoom")
@CrossOrigin(origins="http://localhost:4200")
public class CategoryRoomController {
    @Autowired
    CategoryRoomServiceImplement CategoryRoomService;

    @Autowired
    CategoryRoomRepo categoryRoomRepo;

    @PostMapping("/add")
    public ResponseEntity<CategoryRoom> add(@RequestBody CategoryRoom cm) {
        CategoryRoom newCategoryRoom= CategoryRoomService.addCategoryRoom(cm);
        return new ResponseEntity<>(cm, HttpStatus.CREATED);
    }
}
