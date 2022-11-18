package com.capg.Spring.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
	
	Student student =context.getBean(Student.class);

	System.out.println(student);
	student.display();
	
	}

}
