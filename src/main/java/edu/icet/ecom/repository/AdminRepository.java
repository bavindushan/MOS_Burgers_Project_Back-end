package edu.icet.ecom.repository;

import edu.icet.ecom.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminEntity,Integer> {
}
