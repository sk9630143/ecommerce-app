package in.customer.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.customer.api.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

	@GetMapping("/get")
	public ResponseEntity<Customer> getCustomerById(Integer cid) {
		Customer cutomer = new Customer(11, "Skumar", 13, 1234567L);
		
		return new ResponseEntity<Customer>(cutomer, HttpStatus.OK);
	}
}
