package com.iocapp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AllTasks {
	
	@Autowired
	List<ProjectActivity> projectTasks; //all implementations of ProjectActivity
	
	public void performAllTasks() {
		for (ProjectActivity task : projectTasks) {
			task.performActivity();
		}
		System.out.println("All tasks performed successfully.");
	}

}
