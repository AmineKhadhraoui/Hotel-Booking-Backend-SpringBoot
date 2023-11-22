package com.springbootproject.project.Controller;

import com.springbootproject.project.Model.Reservation;
import com.springbootproject.project.Repository.ReservationRepo;
import com.springbootproject.project.Service.ReservationService;
import com.springbootproject.project.ServiceImplement.ReservationServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins="http://localhost:4200")
public class ReservationController {
    @Autowired
    ReservationServiceImplement ReservationService;

    @Autowired
    ReservationRepo reservationRepo;



    @PostMapping("/add")
    public ResponseEntity<Reservation> add(@RequestBody Reservation res) {
        Reservation newReservation= ReservationService.addReservation(res);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

}
