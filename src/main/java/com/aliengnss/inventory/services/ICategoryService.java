package com.aliengnss.inventory.services;

import java.util.List;
import java.util.Optional;

import com.aliengnss.inventory.dtos.DtoCategoryCreate;
import com.aliengnss.inventory.model.Category;

public interface ICategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category createCategory(DtoCategoryCreate dto);
}
