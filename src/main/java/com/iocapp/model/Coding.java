package com.iocapp.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("code")
@Order(2)
public class Coding implements ProjectActivity {
	
	@Override
	public void performActivity() {
		System.out.println("Performing coding activity...");
	}

}
