package in.orders.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orders.api.entity.Order;

//import jakarta.persistence.criteria.Order;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@GetMapping("/all")
	public ResponseEntity<List<Order>> getAllOrder() {
		
		List<Order> orders = Arrays.asList(new Order(1L, 2, 2312.00, 11), new Order(2L, 13, 13312.00, 17));
		
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}
}
