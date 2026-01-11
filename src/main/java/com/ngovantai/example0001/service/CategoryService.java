package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.CategoryDto;
import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto dto);

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(Long id);

    CategoryDto updateCategory(Long id, CategoryDto dto);

    void deleteCategory(Long id);
}
