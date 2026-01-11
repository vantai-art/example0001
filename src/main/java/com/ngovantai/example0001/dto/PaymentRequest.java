package com.ngovantai.example0001.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class PaymentRequest {
    private Long billId;
    private BigDecimal amount;
    private String orderInfo;
}