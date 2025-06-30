package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iocapp.model.Integrator;
import com.iocapp.model.Task;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringDiApplication.class, args);
		System.out.println("Application started successfully");
		System.out.println("Bean count: " + ac.getBeanDefinitionCount());
		
		Task t=(Task)ac.getBean("text");
		t.execute();
		Task t2=(Task)ac.getBean("image");
		t2.execute();
		
		Integrator integrator=(Integrator)ac.getBean("integrate");
		integrator.integrate();
	}

}
