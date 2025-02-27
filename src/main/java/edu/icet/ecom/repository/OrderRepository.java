package edu.icet.ecom.repository;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

}
