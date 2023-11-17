package com.tns_project.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns_project.springboot.Entity.OrderDetails;
import com.tns_project.springboot.Service.OrderDetailsService;

@RestController

public class OrderDetailsController {

	@Autowired
	OrderDetailsService od;
	
	@PostMapping("/add")
	public OrderDetails add(@RequestBody OrderDetails details) {
		return od.insert(details);
	}
	@GetMapping("/get/{id}")
	public OrderDetails getValues(@PathVariable Integer id) {
		return od.getDetails(id);
	}
	 
	@PutMapping("/alter")
	 
	public OrderDetails update(@RequestBody OrderDetails values) {
		return od.alter(values);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		return od.del(id);
	}
	
	@GetMapping("/records")
	public List<OrderDetails> all(){
		return od.records();
	}

	
	
}
