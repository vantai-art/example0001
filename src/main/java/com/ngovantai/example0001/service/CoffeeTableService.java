package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.CoffeeTableDto;

import java.util.List;

public interface CoffeeTableService {
    CoffeeTableDto createTable(CoffeeTableDto dto);

    CoffeeTableDto getTableById(Long id);

    List<CoffeeTableDto> getAllTables();

    CoffeeTableDto updateTable(Long id, CoffeeTableDto dto);

    void deleteTable(Long id);

    List<CoffeeTableDto> getAvailableTables();
}
