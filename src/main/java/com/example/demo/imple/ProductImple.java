package com.example.demo.imple;


import com.example.demo.dao.ProductDao;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductImple implements ProductService {
    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAllProduct();
    }

    @Override
    public int addProduct(Product product) {
        return productDao.addProduct(product);
    }

    @Override
    public Product findProductById(long pid) {
        return productDao.findProductById(pid);
    }

    @Override
    public int removeProductByIds(List<Long> ids) {
        return productDao.deleteProductByIds(ids);
    }

    @Override
    public int removeProductById(Long id) {
        return productDao.deleteProductById(id);
    }
}

