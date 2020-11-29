package ru.pirozhkov.spring_data.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.pirozhkov.spring_data.config.AppConfig;
import ru.pirozhkov.spring_data.entity.Category;
import ru.pirozhkov.spring_data.entity.Product;
import ru.pirozhkov.spring_data.entity.User;
import ru.pirozhkov.spring_data.services.*;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CategoryService categoryService = applicationContext.getBean("categoryService", CategoryService.class);
        CartService cartService = applicationContext.getBean("cartService", CartService.class);
        CartEntryService cartEntryService = applicationContext.getBean("cartEntryService", CartEntryService.class);
        ProductService productService  = applicationContext.getBean("productService", ProductService.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);

        User user1 = new User("Ann");
        User user2 = new User("Tom");
        userService.save(user1);
        userService.save(user2);
        userService.getAll().stream().forEach(System.out::println);

        Category category1 = new Category();
        category1.setName("aerial videography");
        Category category2 = new Category();
        category2.setName("inspection");
        categoryService.save(category1);
        categoryService.save(category2);
        categoryService.getAll().stream().forEach(System.out::println);

        Product product1 = new Product("Mavic2", 1200, 2);
        Product product2 = new Product("AutelEVO2",1500,1);
        Product product3 = new Product("Phantom4", 1000, 3);
        product1.setCategory(category1);
        product2.setCategory(category2);
        product3.setCategory(category1);
        productService.save(product1);
        productService.save(product2);
        productService.save(product3);
        productService.getAll().stream().forEach(System.out::println);

        System.out.println(productService.findFirstByOrderByPriceDesc());

        System.out.println(productService.findProductByCategory_Id(1));

        System.out.println(productService.findFirstProductByCategory_IdOrderByPriceDesc(1));

        System.out.println(productService.findFirstProductByCategory_IdOrderByPriceAsc(1));

    }
}
