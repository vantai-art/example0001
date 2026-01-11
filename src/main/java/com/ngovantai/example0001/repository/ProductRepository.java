package com.ngovantai.example0001.repository;

import com.ngovantai.example0001.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
