package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.OrderItem;
import edu.icet.ecom.entity.OrderItemEntity;
import edu.icet.ecom.repository.OrderItemRepository;
import edu.icet.ecom.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    final OrderItemRepository repository;
    final ModelMapper mapper;

    @Override
    public void addOrderItem(OrderItem orderItem) {
        repository.save(mapper.map(orderItem, OrderItemEntity.class));
    }

    @Override
    public List<OrderItem> getAll() {
        List<OrderItemEntity> all = repository.findAll();
        List<OrderItem> list = new ArrayList<>();

        all.forEach(orderItemEntity -> list.add(mapper.map(orderItemEntity, OrderItem.class)));
        return list;
    }

    @Override
    public void updateOrderItem(OrderItem orderItem) {
        repository.save(mapper.map(orderItem, OrderItemEntity.class));
    }

    @Override
    public void deleteOrderItem(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public OrderItem searchById(Integer id) {
        return mapper.map(repository.findById(id), OrderItem.class);
    }
}
