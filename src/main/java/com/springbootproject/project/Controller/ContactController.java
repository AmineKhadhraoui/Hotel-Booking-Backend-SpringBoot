package com.springbootproject.project.Controller;


import com.springbootproject.project.Model.Contact;

import com.springbootproject.project.Repository.ContactRepo;
import com.springbootproject.project.Service.ContactService;
import com.springbootproject.project.ServiceImplement.ContactServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Contact")
@CrossOrigin(origins="http://localhost:4200")
public class ContactController {

    @Autowired
     ContactServiceImplement ContactService;

    @Autowired
    ContactRepo contactRepo;

    @PostMapping("/add")
    public ResponseEntity<Contact> add(@RequestBody Contact ct) {
        Contact newContact= ContactService.addContact(ct);
        return new ResponseEntity<>(ct, HttpStatus.CREATED);
    }

}
