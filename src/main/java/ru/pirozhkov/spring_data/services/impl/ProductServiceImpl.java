package ru.pirozhkov.spring_data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pirozhkov.spring_data.entity.Product;
import ru.pirozhkov.spring_data.repositories.ProductRepository;
import ru.pirozhkov.spring_data.services.ProductService;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Product get(Integer id) {
        return productRepository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    @Transactional
    public void remove(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Product findFirstByOrderByPriceDesc() {
        return productRepository.findFirstByOrderByPriceDesc();
    }

    @Override
    public List<Product> findProductByCategory_Id(int category_id) {
        return productRepository.findProductByCategory_Id(category_id);
    }

    @Override
    public Product findFirstProductByCategory_IdOrderByPriceDesc(int category_id) {
        return productRepository.findFirstProductByCategory_IdOrderByPriceDesc(category_id);
    }

    @Override
    public Product findFirstProductByCategory_IdOrderByPriceAsc(int category_id) {
        return productRepository.findFirstProductByCategory_IdOrderByPriceAsc(category_id);
    }


}
