package com.springsecurity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autoWiringWithInterface.EmpService;

public class InterfaceAutoWireTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  ac = new AnnotationConfigApplicationContext(InterfaceAppConfig.class);
		EmpService e = ac.getBean("empService",EmpService.class);
		System.out.println("e ::"+e);
		
		ac.close();
	}

}
