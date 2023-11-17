package com.tns_project.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns_project.springboot.Entity.OrderDetails;
import com.tns_project.springboot.Repository.OrderDetailsRepo;

@Service

public class OrderDetailsService {
	@Autowired
	OrderDetailsRepo repo;
	
	public OrderDetails insert(OrderDetails ma) {
		return repo.save(ma);
	}
	public OrderDetails getDetails(Integer ma) {
		java.util.Optional<OrderDetails> findById = repo.findById(ma);
		return findById.get();
	}
    public OrderDetails alter(OrderDetails ma) {
    	return repo.save(ma);
    }
    public String del(Integer id) {
    	OrderDetails d=repo.findById(id).get();
    	repo.delete(d);
    	return "deleted sucessfully";
    }
    public List<OrderDetails> records(){
    	return repo.findAll();
    }
 	
}
