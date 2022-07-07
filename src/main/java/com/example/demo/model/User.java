package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    public void setId(long id) {
    	this.id = id;
    }

    public long getId() {
    	return this.id;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getName() {
    	return this.name;
    }

    public void setEmail(String email) {
    	this.email = email;
    }

    public String getEmail() {
    	return this.email;
    }
}