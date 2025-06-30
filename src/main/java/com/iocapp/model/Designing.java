package com.iocapp.model;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("design")
@Order(1) // Optional: specify order if needed
@Primary
public class Designing implements ProjectActivity{

	@Override
	public void performActivity() {
		System.out.println("Performing design activity...");
	}



}
