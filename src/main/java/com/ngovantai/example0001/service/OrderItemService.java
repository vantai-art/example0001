package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.OrderItemDto;
import com.ngovantai.example0001.entity.OrderItem;
import java.util.List;

public interface OrderItemService {

    List<OrderItem> getItemsByOrder(Long orderId);

    OrderItem createItem(OrderItemDto dto);

    void deleteItem(Long id);
}
