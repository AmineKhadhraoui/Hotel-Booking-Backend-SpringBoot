package com.springbootproject.project.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class CategoryRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoryRoom;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "ctr", cascade = {CascadeType.MERGE})
    private List<Room> lr;
    

    public CategoryRoom() {
    }

    public Long getIdCategoryRoom() {
        return idCategoryRoom;
    }

    public void setIdCategoryRoom(Long idCategoryRoom) {
        this.idCategoryRoom = idCategoryRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
