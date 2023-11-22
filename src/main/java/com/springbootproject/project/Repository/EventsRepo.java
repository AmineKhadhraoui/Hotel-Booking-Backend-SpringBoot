package com.springbootproject.project.Repository;

import com.springbootproject.project.Model.Events;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepo extends JpaRepository<Events,Long> {
}
