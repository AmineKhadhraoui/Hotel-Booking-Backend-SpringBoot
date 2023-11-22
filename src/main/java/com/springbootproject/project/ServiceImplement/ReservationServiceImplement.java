package com.springbootproject.project.ServiceImplement;

import com.springbootproject.project.Model.Reservation;
import com.springbootproject.project.Repository.ReservationRepo;
import com.springbootproject.project.Service.ReservationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReservationServiceImplement implements ReservationService {

    @Autowired
    private ReservationRepo repository;

    public Reservation addReservation(Reservation res){
        return  repository.save(res);    }
}
