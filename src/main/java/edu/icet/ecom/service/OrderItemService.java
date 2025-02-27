package edu.icet.ecom.service;

import edu.icet.ecom.dto.OrderItem;

import java.util.List;

public interface OrderItemService {
    void addOrderItem(OrderItem orderItem);

    List<OrderItem> getAll();

    void updateOrderItem(OrderItem orderItem);

    void deleteOrderItem(Integer id);

    OrderItem searchById(Integer id);
}
