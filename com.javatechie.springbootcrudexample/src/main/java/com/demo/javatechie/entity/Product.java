  package com.demo.javatechie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product" )
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //to autogenerate value
	private int id;
	private String name;
	private int quantity;
	private double price;
	
}
