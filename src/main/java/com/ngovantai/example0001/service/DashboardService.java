package com.ngovantai.example0001.service;

import java.util.Map;

public interface DashboardService {
    Map<String, Object> getDashboardStats();

    Map<String, Object> getRevenue(String startDate, String endDate);
}