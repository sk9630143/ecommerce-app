package in.product.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.product.api.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@GetMapping("/all/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = Arrays.asList(new Product(1L, "Mobile", "Motorola G65", 12999.00),
				new Product(2L, "Laptop", "Mackbook", 137000.00));
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		
	}
}
