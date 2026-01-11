package com.ngovantai.example0001.repository;

import com.ngovantai.example0001.entity.Settings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingsRepository extends JpaRepository<Settings, Long> {
}
