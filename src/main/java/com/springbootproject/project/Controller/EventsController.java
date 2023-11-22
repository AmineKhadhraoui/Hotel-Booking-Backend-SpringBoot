package com.springbootproject.project.Controller;


import com.springbootproject.project.Model.Events;
import com.springbootproject.project.Model.Reservation;
import com.springbootproject.project.Repository.EventsRepo;
import com.springbootproject.project.ServiceImplement.EventsServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Events")
@CrossOrigin(origins="http://localhost:4200")
public class EventsController {

    @Autowired
    EventsServiceImplement EventsService;

    @Autowired
    EventsRepo eventsRepo;

    @PostMapping("/add")
    public ResponseEntity<Events> add(@RequestBody Events et) {
        Events newEvent= EventsService.addEvent(et);
        return new ResponseEntity<>(et, HttpStatus.CREATED);
    }
}
