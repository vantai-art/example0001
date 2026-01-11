package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.PaymentRequest;
import java.util.Map;

public interface PaymentService {
    String createVNPayPayment(PaymentRequest request);

    boolean verifyVNPayCallback(Map<String, String> params);

    String createMoMoPayment(PaymentRequest request);
}