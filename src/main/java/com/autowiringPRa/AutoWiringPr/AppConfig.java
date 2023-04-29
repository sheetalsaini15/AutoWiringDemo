package com.autowiringPRa.AutoWiringPr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {
	
	public static void main(String s[])
	{
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
		System.out.print("hello java autoWired");
		Employee emp = ac.getBean("eob",Employee.class);
		System.out.print("emp::"+emp);
		ac.close();
	}

}
