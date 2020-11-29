package ru.pirozhkov.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.pirozhkov.spring_data.entity.Category;
import ru.pirozhkov.spring_data.entity.Product;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//      @Query ( "SELECT MAX (p.price) FROM Product p")

      Product findFirstByOrderByPriceDesc();

//      @Query( "SELECT p FROM Product p WHERE p.price = (SELECT max(price) FROM Product)")
//      Product findMaxPriceProduct ();

      List<Product> findProductByCategory_Id(int category_id);

      Product findFirstProductByCategory_IdOrderByPriceDesc(int category_id);

      Product findFirstProductByCategory_IdOrderByPriceAsc(int category_id);


      
}
