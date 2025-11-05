package com.aliengnss.inventory.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aliengnss.inventory.model.Category;

public interface ICategoryDao extends JpaRepository<Category, Long> {
    
}
