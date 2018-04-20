package com.jacarrichan.demo.sdr.dao.mapper;

import com.jacarrichan.demo.sdr.dao.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    Product select(
            @Param("id")
                    long id);

    void update(Product product);
}
