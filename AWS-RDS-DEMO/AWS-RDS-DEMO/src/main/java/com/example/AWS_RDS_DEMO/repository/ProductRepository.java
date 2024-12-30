package com.example.AWS_RDS_DEMO.repository;

import com.example.AWS_RDS_DEMO.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

