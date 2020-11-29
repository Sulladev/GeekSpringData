package ru.pirozhkov.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.pirozhkov.spring_data.entity.Cart;
import ru.pirozhkov.spring_data.entity.Product;
import ru.pirozhkov.spring_data.entity.User;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

//    Cart findByCode(String code);
//
//    @Query("SELECT с FROM Cart с WHERE с.user = :user")
//    Cart findCartByUser(@Param("user") User user);
//
//    @Query("SELECT c FROM Cart c JOIN c.cartEntryList ce WHERE ce.product = :product")
//    List<Cart> findAllCartsByProduct(@Param("product") Product product);

}

