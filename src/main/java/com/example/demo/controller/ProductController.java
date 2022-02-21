package com.example.demo.controller;


import com.example.demo.api.Result;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import com.example.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //查询全部的商品信息
//    @GetMapping("/list")
//    public List<Product> findAllProduct() {
//        return productService.findAllProduct();
//    }
    @GetMapping("/list")
    public Result<Product> findAllProduct() {
        List<Product> productList = productService.findAllProduct();
        return ResultUtil.success(productList);
    }


    //    @GetMapping("/list/{id}")
//    public Product findProductById(@PathVariable("id") long pid){
//        return productService.findProductById(pid);
//    }
    @GetMapping("/list/{id}")
    public Result<Product> findProductById(@PathVariable("id") long pid) {
        Product product = productService.findProductById(pid);
        return ResultUtil.success(product);
    }


    @PostMapping("/add")
    public Result<Product> addProduct(@Validated @RequestBody Product product, BindingResult bindingResult) {
        int count = productService.addProduct(product);
        if (count == 1) {
            return ResultUtil.success(count);
        } else {
            return ResultUtil.error(500, "添加失败");
        }
    }

    @PostMapping("/deleteBatch")
    public Result<Product> deleteBatch(@RequestParam List<Long> ids) {
        int count = productService.removeProductByIds(ids);
        return ResultUtil.success(count);
    }

    @PostMapping("/deleteById/{id}")
    public Result<Product> deleteById(@PathVariable("id") Long id) {
        int count = productService.removeProductById(id);
        return ResultUtil.success(count);
    }


}

