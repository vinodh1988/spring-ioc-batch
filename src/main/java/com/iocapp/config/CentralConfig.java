package com.iocapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.iocapp.model.ImageCreator;
import com.iocapp.model.Integrator;
import com.iocapp.model.Task;
import com.iocapp.model.TextCreator;

@Configuration
public class CentralConfig {
	{
		System.out.println("CentralConfig class loaded");
	}
	
	@Bean(name="text")
	@Scope("prototype") // This ensures a new instance is created each time
	public Task textTask() {
		return new TextCreator();
	}
	
	@Bean(name="image")
	@Scope("prototype") // This ensures a new instance is created each time
	public Task imageTask() {
		return new ImageCreator();
	}
	
	@Bean(name="integrate")
	public Integrator integrator() {
		return new Integrator();
	}
	

}
