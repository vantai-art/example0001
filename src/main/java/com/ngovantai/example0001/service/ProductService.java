package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto dto);

    ProductDto getProductById(Long id);

    List<ProductDto> getAllProducts();

    ProductDto updateProduct(Long id, ProductDto dto);

    void deleteProduct(Long id);
}
