package com.example.feignpproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.feignpproject.entity.Product;

@Service
public class FeignTestService {

	private static List<Product> productList = new ArrayList<>();
	static {
		productList.add(new Product(1, "product-1", 12.0));
		productList.add(new Product(2, "product-2", 34.0));
		productList.add(new Product(3, "product-3", 9.0));
	}

	public List<Product> findProducts() {
		return productList;
	}

	public Product findById(int id) {
		Product prod = findProduct(id);
		return prod;
	}

	private Product findProduct(int id) {
		return productList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
	}
}
