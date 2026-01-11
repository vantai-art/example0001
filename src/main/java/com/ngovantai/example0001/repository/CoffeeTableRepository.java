package com.ngovantai.example0001.repository;

import com.ngovantai.example0001.entity.CoffeeTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeTableRepository extends JpaRepository<CoffeeTable, Long> {
    List<CoffeeTable> findByStatus(CoffeeTable.TableStatus status);
}
