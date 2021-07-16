package com.example.feignpproject.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.feignpproject.entity.Product;

@FeignClient(name = "product-service", url = "http://localhost:9909/v1")
public interface IProductServiceClient {
	
	 @RequestMapping(value = "/products", method = RequestMethod.GET)
	 public List < Product > getAllProducts();

	 @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	 public Product getProduct(@PathVariable("id") int productId);
	

}
