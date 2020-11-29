package ru.pirozhkov.spring_data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pirozhkov.spring_data.entity.Cart;
import ru.pirozhkov.spring_data.entity.CartEntry;
import ru.pirozhkov.spring_data.entity.Product;
import ru.pirozhkov.spring_data.repositories.CartEntryRepository;
import ru.pirozhkov.spring_data.services.CartEntryService;

import java.util.List;

@Service("cartEntryService")
public class CartEntryServiceImpl implements CartEntryService {

    private CartEntryRepository cartEntryRepository;

    @Autowired
    public void setCartEntryRepository(CartEntryRepository cartEntryRepository) {
        this.cartEntryRepository = cartEntryRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public CartEntry get(Integer id) {
        return cartEntryRepository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CartEntry> getAll() {
        return cartEntryRepository.findAll();
    }

    @Override
    @Transactional
    public void save(CartEntry cartEntry) {
        cartEntryRepository.save(cartEntry);
    }

    @Override
    @Transactional
    public void remove(CartEntry cartEntry) {
        cartEntryRepository.delete(cartEntry);
    }

    @Override
    @Transactional
    public CartEntry addProduct(Cart cart, Product product, Integer quantity) {
        CartEntry cartEntry = new CartEntry();
        cartEntry.setCart(cart);
        cartEntry.setProduct(product);
        cartEntry.setQuantity(quantity);
        cartEntry.setPrice(product.getPrice());
        return cartEntryRepository.save(cartEntry);
    }
}
