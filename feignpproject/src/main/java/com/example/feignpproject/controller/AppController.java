package com.example.feignpproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@Autowired
	private IProductServiceClient productServiceClient;

	@GetMapping("/fetchProducts")
	public ResponseEntity<?> fetchProducts() {

		return ResponseEntity.ok(productServiceClient.getAllProducts());
	}

	@GetMapping("/fetchProduct/{id}")
	public ResponseEntity<?> fetchProduct(@PathVariable int id) {

		return ResponseEntity.ok(productServiceClient.getProduct(id));
	}

}
