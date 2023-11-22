package com.springbootproject.project.Repository;

import com.springbootproject.project.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
