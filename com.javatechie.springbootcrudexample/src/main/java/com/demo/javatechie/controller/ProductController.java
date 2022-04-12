package com.demo.javatechie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.javatechie.entity.Product;
import com.demo.javatechie.service.ServiceImpl;

import antlr.collections.*;
import java.util.List;

@RestController
public class ProductController {

	@Autowired
	public ServiceImpl service;
	 
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
     return service.saveProducts(products);
}
	 @GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	 @GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getPoductById(id);
	}
	@GetMapping("/products/{name}")//@pathvariable any input you want to pass as a requestvariable 
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete")
	public String  deleteProduct(@PathVariable int id) {
     return service.deleteProduct(id);		
	}
}
