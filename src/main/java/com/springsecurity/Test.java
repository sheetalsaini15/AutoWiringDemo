package com.springsecurity;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowiring.Employee;

public class Test {
	
	public static void main(String[] args) {
		//App config class name can be anything, this is spring contianer refernce here 
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//read employye object
		
	Employee e = 	ac.getBean("eob",Employee.class);
	System.out.println("employee object is:"+ e);
		ac.close();
		}

}
