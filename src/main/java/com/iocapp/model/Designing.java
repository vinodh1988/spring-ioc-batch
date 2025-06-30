package com.iocapp.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("design")
@Primary
public class Designing implements ProjectActivity{

	@Override
	public void performActivity() {
		System.out.println("Performing design activity...");
	}



}
