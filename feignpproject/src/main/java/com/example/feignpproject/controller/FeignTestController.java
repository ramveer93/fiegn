package com.example.feignpproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignpproject.entity.Product;
import com.example.feignpproject.service.FeignTestService;

@RestController
@RequestMapping("/v1")
public class FeignTestController {

	@Autowired
	private FeignTestService service;

	

	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getProsucts() {
		List<Product> prods = this.service.findProducts();
		return ResponseEntity.ok(prods);
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getProsuct(@PathVariable int id) {
		Product prods = this.service.findById(id);
		return ResponseEntity.ok(prods);
	}

}
