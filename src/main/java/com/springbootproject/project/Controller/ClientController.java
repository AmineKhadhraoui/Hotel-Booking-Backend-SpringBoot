package com.springbootproject.project.Controller;

import com.springbootproject.project.Model.CategoryRoom;
import com.springbootproject.project.Model.Client;
import com.springbootproject.project.Repository.ClientRepo;
import com.springbootproject.project.ServiceImplement.ClientServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins="http://localhost:4200")
public class ClientController {

    @Autowired
    ClientServiceImplement ClientService;

    @Autowired
    ClientRepo Clientrepo;

    @PostMapping("/add")
    public ResponseEntity<Client> add(@RequestBody Client ct) {
        Client newClient= ClientService.addClient(ct);
        return new ResponseEntity<>(ct, HttpStatus.CREATED);
    }
}
