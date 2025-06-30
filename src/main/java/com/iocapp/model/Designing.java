package com.iocapp.model;

import org.springframework.stereotype.Component;

@Component
public class Designing implements ProjectActivity{

	@Override
	public void performActivity() {
		System.out.println("Performing design activity...");
	}



}
