package ru.pirozhkov.spring_data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pirozhkov.spring_data.entity.Cart;
import ru.pirozhkov.spring_data.repositories.CartRepository;
import ru.pirozhkov.spring_data.services.CartService;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;

    @Autowired
    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public Cart get(Integer id) {
        return cartRepository.getOne(id);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    @Transactional
    public void remove(Cart cart) {
        cartRepository.delete(cart);
    }
}
