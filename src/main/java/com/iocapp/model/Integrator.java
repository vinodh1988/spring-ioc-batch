package com.iocapp.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Integrator {
   @Autowired	
   private ProjectActivity projectActivity;
   
   public void integrate() {
	  // Perform integration logic
	  projectActivity.performActivity();
   }
}
