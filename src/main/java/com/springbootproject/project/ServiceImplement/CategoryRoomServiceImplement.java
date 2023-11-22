package com.springbootproject.project.ServiceImplement;

import com.springbootproject.project.Model.CategoryRoom;
import com.springbootproject.project.Repository.CategoryRoomRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryRoomServiceImplement {
    @Autowired
    private CategoryRoomRepo repository;

    public CategoryRoom addCategoryRoom(CategoryRoom cm)
    {
        return  repository.save(cm);
    }
}
