package edu.icet.ecom.repository;

import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
}
