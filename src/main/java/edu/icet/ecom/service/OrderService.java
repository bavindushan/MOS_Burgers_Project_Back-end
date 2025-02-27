package edu.icet.ecom.service;

import edu.icet.ecom.dto.Order;

public interface OrderService {
    void addOrder(Order order);

    void updateOrder(Order order);
}
