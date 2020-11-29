package ru.pirozhkov.spring_data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pirozhkov.spring_data.entity.Category;
import ru.pirozhkov.spring_data.repositories.CategoryRepository;
import ru.pirozhkov.spring_data.services.CategoryService;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Category get(Integer id) {
        return categoryRepository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Category category) {
        categoryRepository.delete(category);
    }
}
