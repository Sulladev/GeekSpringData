package ru.pirozhkov.spring_data.services;


import org.springframework.stereotype.Repository;
import ru.pirozhkov.spring_data.entity.Category;

import java.util.List;

public interface CategoryService {
    Category get(Integer id);
    List<Category> getAll();
    void save(Category category);
    void remove(Category category);
}
