package com.springbootproject.project.Repository;

import com.springbootproject.project.Model.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {
}
