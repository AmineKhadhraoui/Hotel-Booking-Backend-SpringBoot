package com.springbootproject.project.ServiceImplement;

import com.springbootproject.project.Model.Events;
import com.springbootproject.project.Repository.EventsRepo;
import com.springbootproject.project.Service.EventsService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EventsServiceImplement implements EventsService {

    @Autowired
    private EventsRepo repository;

    public Events addEvent(Events et){
        return  repository.save(et);    }
}
