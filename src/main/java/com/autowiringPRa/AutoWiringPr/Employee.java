package com.autowiringPRa.AutoWiringPr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class Employee {

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}
	@Value("Sheetal")
	private String name;
	@Value("id123")
	private String id;
	@Autowired(required = false)
	private Address addr;
	
	
}
