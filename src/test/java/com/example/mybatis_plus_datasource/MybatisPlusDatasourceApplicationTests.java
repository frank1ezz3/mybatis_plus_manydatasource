package com.example.mybatis_plus_datasource;

import com.example.mybatis_plus_datasource.Service.ProductService;
import com.example.mybatis_plus_datasource.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDatasourceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @Test
    public void test(){
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
        //User(id=1, name=Jone, age=18, sex=null, email=test1@baomidou.com, is_delete=null)
        //Product(id=1, name=外星人笔记本, price=100, version=0)
    }

}
