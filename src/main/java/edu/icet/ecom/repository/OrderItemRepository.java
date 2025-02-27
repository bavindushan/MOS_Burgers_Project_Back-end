package edu.icet.ecom.repository;

import edu.icet.ecom.dto.OrderItem;
import edu.icet.ecom.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity,Integer> {
}
