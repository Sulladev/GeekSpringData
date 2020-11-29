package ru.pirozhkov.spring_data.services;

import ru.pirozhkov.spring_data.entity.Cart;
import ru.pirozhkov.spring_data.entity.CartEntry;
import ru.pirozhkov.spring_data.entity.Product;

import java.util.List;

public interface CartEntryService {

    CartEntry get(Integer id);
    List<CartEntry> getAll();
    void save(CartEntry cartEntry);
    void remove(CartEntry cartEntry);
    CartEntry addProduct(Cart cart, Product product, Integer quantity);
}
