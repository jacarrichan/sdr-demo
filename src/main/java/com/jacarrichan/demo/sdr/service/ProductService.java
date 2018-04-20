package com.jacarrichan.demo.sdr.service;

import com.jacarrichan.demo.sdr.dao.domain.Product;
import com.jacarrichan.demo.sdr.dao.mapper.ProductMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by AA2668 on 2018/4/20.
 */
@Service
public class ProductService {
    @Resource
    private ProductMapper mapper;

    @Cacheable(value = "product", key = "#id")
    public Product select(Long id) {
        return mapper.select(id);
    }
}
