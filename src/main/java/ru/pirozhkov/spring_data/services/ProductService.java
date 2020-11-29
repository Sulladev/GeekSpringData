package ru.pirozhkov.spring_data.services;

import ru.pirozhkov.spring_data.entity.Product;

import java.util.List;

public interface ProductService {

    Product get(Integer id);
    List<Product> getAll();
    void save(Product product);
    void remove(Product product);
//    Product findByName(String name);
//    List<Product> findAllByPriceGreaterThan(Double price);
//    List<Product> findAllByPriceGreaterThanOrderByPriceDesc(Double price);
    Product findFirstByOrderByPriceDesc();
    List<Product> findProductByCategory_Id(int category_id);
    Product findFirstProductByCategory_IdOrderByPriceDesc(int category_id);
    Product findFirstProductByCategory_IdOrderByPriceAsc(int category_id);
}
