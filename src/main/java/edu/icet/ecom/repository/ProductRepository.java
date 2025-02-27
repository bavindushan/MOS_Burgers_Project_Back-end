package edu.icet.ecom.repository;

import edu.icet.ecom.dto.Product;
import edu.icet.ecom.entity.AdminEntity;
import edu.icet.ecom.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {

    Optional<ProductEntity> findTopByOrderByIdDesc();

    Optional<ProductEntity> findByName(String name);
}
