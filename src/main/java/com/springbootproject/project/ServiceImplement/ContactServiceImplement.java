package com.springbootproject.project.ServiceImplement;

import com.springbootproject.project.Model.Contact;
import com.springbootproject.project.Model.Reservation;
import com.springbootproject.project.Repository.ContactRepo;
import com.springbootproject.project.Service.ContactService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContactServiceImplement implements ContactService {

    @Autowired
    private ContactRepo repository;

    public Contact addContact(Contact ct){
        return  repository.save(ct);    }
}
