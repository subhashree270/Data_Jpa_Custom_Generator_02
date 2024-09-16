package com.subha.entity;

import org.hibernate.annotations.GenericGenerator;

import com.subha.generator.ItemIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(generator="custom_uuid")
	@GenericGenerator(name="custom_uuid",type = ItemIdGenerator.class)	
	private String id;
	private String name;
	private Integer quantity;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
