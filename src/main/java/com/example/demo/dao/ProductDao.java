package com.example.demo.dao;

import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductDao {
    //    @Select("select * from product")
    List<Product> findAllProduct();

//    @Insert("insert into product('pname','pprice','ptime','pcount','pstatus') VALUES(#{pname},#{pprice},#{ptime},#{pcount},#{pstatus})")
//    @Options(useGeneratedKeys = true,keyProperty = "Pid")
    int addProduct(Product product);

    Product findProductById(@Param("id") long pid);

    int deleteProductByIds(@Param("ids") List<Long> ids);

    int deleteProductById(@Param("id") Long id);

}

