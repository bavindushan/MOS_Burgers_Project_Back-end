package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    final OrderRepository repository;
    final ModelMapper mapper;

    @Override
    public void addOrder(Order order) {
        repository.save(mapper.map(order, OrderEntity.class));
    }
}
