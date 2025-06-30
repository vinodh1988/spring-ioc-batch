package com.iocapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Integrator {
   @Autowired	
  @Qualifier("code")
  // private ProjectActivity code;
   private ProjectActivity code;
   @Autowired
   private AllTasks allTasks;
   public void integrate() {
	  // Perform integration logic
	  code.performActivity();
   }
   
   public void allTasks() {
	  System.out.println("Performing all tasks in the integration process...");
	  allTasks.performAllTasks();
   }
   
}
