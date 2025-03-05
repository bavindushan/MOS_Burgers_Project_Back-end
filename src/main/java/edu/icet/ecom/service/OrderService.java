package edu.icet.ecom.service;

import edu.icet.ecom.dto.Order;

import java.util.List;

public interface OrderService {
    Order addOrder(Order order);

    void updateOrder(Order order);

    List<Order> getAll();

    void deleteOrder(Integer id);

    Order searchById(Integer id);

}
