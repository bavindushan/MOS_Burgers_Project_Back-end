package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.dto.OrderItem;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.entity.OrderItemEntity;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    final OrderRepository repository;
    final ModelMapper mapper;

    @Override
    public Order addOrder(Order order) {

        OrderEntity savedOrder = repository.save(mapper.map(order, OrderEntity.class));
        return mapper.map(savedOrder,Order.class);
    }

    @Override
    public void updateOrder(Order order) {
        repository.save(mapper.map(order, OrderEntity.class));
    }

    @Override
    public List<Order> getAll() {
        List<OrderEntity> all = repository.findAll();
        List<Order> list = new ArrayList<>();

        all.forEach(orderEntity -> list.add(mapper.map(orderEntity,Order.class)));
        return list;
    }

    @Override
    public void deleteOrder(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Order searchById(Integer id) {
        return repository.findById(id)
                .map(orderEntity -> mapper.map(orderEntity,Order.class))
                .orElse(null);
    }

}
