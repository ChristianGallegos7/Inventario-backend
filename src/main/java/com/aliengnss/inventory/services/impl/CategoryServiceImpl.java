package com.aliengnss.inventory.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aliengnss.inventory.dao.ICategoryDao;
import com.aliengnss.inventory.model.Category;
import com.aliengnss.inventory.services.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    @Transactional(readOnly = true)
    public List<Category> getAllCategories() {
        List<Category> categories = (List<Category>) categoryDao.findAll();
        return categories;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Category> getCategoryById(Long id) {
        return categoryDao.findById(id);
    }

}
