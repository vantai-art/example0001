package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.SettingsDTO;
import com.ngovantai.example0001.entity.Settings;

public interface SettingsService {
    Settings getSettings();

    Settings updateSettings(SettingsDTO dto);
}
