package com.springbootproject.project.Repository;

import com.springbootproject.project.Model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Long> {
}
