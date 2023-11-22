package com.springbootproject.project.Repository;


import com.springbootproject.project.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,Long> {
}
