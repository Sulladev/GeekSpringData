package ru.pirozhkov.spring_data.services;

import ru.pirozhkov.spring_data.entity.Cart;
import ru.pirozhkov.spring_data.entity.Product;
import ru.pirozhkov.spring_data.entity.User;

import java.util.List;

public interface CartService {

    Cart get(Integer id);
//    Cart getByCode(String code);
    List<Cart> getAll();
    void save(Cart cart);
    void remove(Cart cart);

//    Cart findCartByUser(User user);
//    List<Cart> findAllCartsByProduct(Product product);
}
