package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.PromotionDTO;

import java.util.List;

public interface PromotionService {
    PromotionDTO createPromotion(PromotionDTO promotionDTO);

    PromotionDTO updatePromotion(Long id, PromotionDTO promotionDTO);

    void deletePromotion(Long id);

    PromotionDTO getPromotionById(Long id);

    List<PromotionDTO> getAllPromotions();
}
