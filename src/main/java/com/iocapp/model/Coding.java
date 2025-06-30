package com.iocapp.model;

import org.springframework.stereotype.Component;

@Component("code")
public class Coding implements ProjectActivity {
	
	@Override
	public void performActivity() {
		System.out.println("Performing coding activity...");
	}

}
