package com.test.crudApi.service;

import com.test.crudApi.model.dao.CategoryRepository;
import com.test.crudApi.model.dao.ProductRepository;
import com.test.crudApi.model.entities.Category;
import com.test.crudApi.model.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DataService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public void mock() {
        Category techCat = new Category("Tech");
        Category sportCat = new Category("Sport");

        Product laptop = new Product("Dell Inspiron", "Dell Laptop i7", 900.00);
        laptop.setCategory(techCat);
        laptop.getRefs().add("AAA");
        laptop.getRefs().add("BBB");
        Product ps5 = new Product("Playstation 5", "Playstation 5 2To", 500.00);
        ps5.setCategory(techCat);
        Product printer = new Product("Printer ", "Printer Samsung 5000", 300.00);
        printer.setCategory(techCat);

        Product ball = new Product("Ball", "World cup ball", 90.00);
        ball.setCategory(sportCat);
        Product gloves = new Product("Boxing gloves", "Adidas boxing gloves", 55.00);
        gloves.setCategory(sportCat);

        categoryRepository.save(techCat);
        categoryRepository.save(sportCat);

        productRepository.save(laptop);
        productRepository.save(ps5);
        productRepository.save(printer);
        productRepository.save(ball);
        productRepository.save(gloves);

        Product pTest = new Product("Test ", "Mon test", 3746.00);
        pTest.setCategory(techCat);
        productRepository.save(pTest);

//        sportCat.getProducts().add(pTest);

//        System.out.println(techCat.getProducts());
//        System.out.println(categoryRepository.findAll().stream().map(c -> c.getProducts()).collect(Collectors.toList()));
    }

}
