package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class Employee {
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", add=" + add + "]";
	}

	@Value("10")
	int empId;
	@Autowired(required = false)
	Address add;
	
	

}
