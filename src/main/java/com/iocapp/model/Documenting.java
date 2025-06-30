package com.iocapp.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Documenting implements ProjectActivity {

	@Override
	public void performActivity() {
		// TODO Auto-generated method stub
           System.out.println("Performing documentation activity...");
	}

}
