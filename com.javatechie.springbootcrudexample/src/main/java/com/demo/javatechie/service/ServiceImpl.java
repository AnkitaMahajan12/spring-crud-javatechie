package com.demo.javatechie.service;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.jar.Attributes.Name;

import com.demo.javatechie.entity.Product;
import com.demo.javatechie.repository.ProductRepository;

import antlr.collections.*;
import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
 
@Service
public class ServiceImpl {

	//INJECT REPOSITORY IN SEEVICE
	@Autowired
	private ProductRepository repository;
	
	//post
	public Product saveProduct(Product product) {
	 return	repository.save(product);
	 }
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	//get
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	public Product getPoductById(int id) {
		return repository.findById(id).orElse(null);
}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	//delete
	
	public String deleteProduct(int id) {
	 repository.deleteById(id);
		return "product removed" +id;
	}
	
	public Product updateProduct( Product product) {
		Product existingProduct= repository.findById(product.getId()).orElse(null);
	     existingProduct.setName(product.getName());
	     existingProduct.setQuantity(product.getQuantity());
	     existingProduct.setPrice(product.getPrice());
	     return repository.save(existingProduct); 
	}
	
 	
}