package com.tns_project.springboot.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tns_project.springboot.Entity.OrderDetails;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer>{
	
}
