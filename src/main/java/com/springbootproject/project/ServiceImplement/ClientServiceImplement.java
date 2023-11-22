package com.springbootproject.project.ServiceImplement;

import com.springbootproject.project.Model.Client;
import com.springbootproject.project.Repository.ClientRepo;
import com.springbootproject.project.Service.ClientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientServiceImplement implements ClientService {

    @Autowired
    private ClientRepo repository;

    public Client addClient(Client ct){
        return repository.save(ct);
    }
}
