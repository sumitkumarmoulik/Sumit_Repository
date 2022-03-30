package com.dependencyinjection.demo;

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
public class Technologies {

	private int techID;
	private String techName;
	
	public void tech() {
		System.out.println("Technologies Object return successfully");
	}
	
}
