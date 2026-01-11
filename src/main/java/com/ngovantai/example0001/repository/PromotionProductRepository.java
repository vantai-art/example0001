package com.ngovantai.example0001.repository;

import com.ngovantai.example0001.entity.PromotionProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionProductRepository extends JpaRepository<PromotionProduct, Long> {
}
