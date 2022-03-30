package com.dependencyinjection.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Component
@NonNull
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Customers {

	
	private int custID;
	private String custName;
	private String courseName;
	@Autowired
	private Technologies techDetails;
	
	public void display() {
		System.out.println("Customers Object return successfully");
		System.out.println("Customers Object return successfully");
		techDetails.tech();
	}
	
}
