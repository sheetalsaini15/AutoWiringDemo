package com.autowiringInterf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.autowiringInterf.EmpService;

public class IAppCongif {
	
	public static void main(String s[])
	{
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
		System.out.print("hello...");
		EmpService es = ac.getBean("eob", EmpService.class);
		System.out.print("es is :::"+es);
		ac.close();
		
	}

}
