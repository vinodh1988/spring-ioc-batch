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
		Task t1=(Task)ac.getBean("text");
		Task t2=(Task)ac.getBean("text");
		t.execute();
		t1.execute();
		t2.execute();
		System.out.println("----------------------------------------------------");
		Task a=(Task)ac.getBean("image");
		Task a1=(Task)ac.getBean("image");
		Task a2=(Task)ac.getBean("image");
		
		a.execute();
		a1.execute();
		a2.execute();
		System.out.println("The hash code of text task: " + t.hashCode());
		System.out.println("The hash code of text task1: " + t1.hashCode());
		System.out.println("The hash code of text task2: " + t2.hashCode());
		
		System.out.println("The hash code of image task: " + a.hashCode());
		System.out.println("The hash code of image task1: " + a1.hashCode());
		System.out.println("The hash code of image task2: " + a2.hashCode());
		
		/*
		Integrator integrator=(Integrator)ac.getBean("integrate");
		integrator.integrate();
		integrator.allTasks();*/
	}

}
