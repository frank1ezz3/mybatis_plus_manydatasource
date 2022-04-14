package com.example.mybatis_plus_datasource.Service.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis_plus_datasource.Service.ProductService;
import com.example.mybatis_plus_datasource.mapper.ProductMapper;
import com.example.mybatis_plus_datasource.pojo.Product;
import org.springframework.stereotype.Service;

@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
