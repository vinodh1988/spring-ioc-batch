package com.iocapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Integrator {
   @Autowired	
  @Qualifier("code")
  // private ProjectActivity code;
   private ProjectActivity code;
   public void integrate() {
	  // Perform integration logic
	  code.performActivity();
   }
}
