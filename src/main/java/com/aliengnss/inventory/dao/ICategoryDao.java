package com.aliengnss.inventory.dao;
import org.springframework.data.repository.CrudRepository;
import com.aliengnss.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {
    
}
