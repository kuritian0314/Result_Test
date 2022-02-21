package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();

    int addProduct(Product product);

    Product findProductById(long pid);

    int removeProductByIds(List<Long> ids);

    int removeProductById(Long id);
}

