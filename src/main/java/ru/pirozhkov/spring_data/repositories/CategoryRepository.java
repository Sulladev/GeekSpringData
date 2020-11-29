package ru.pirozhkov.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pirozhkov.spring_data.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    //    List<Category> findAllBy (int id);
}
