package com.example.dynmodbDemo.repository;

import com.example.dynmodbDemo.entity.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan

public interface ProductInfoRepository extends CrudRepository<Product, String> {
    Optional<Product> findById(String id);
}
