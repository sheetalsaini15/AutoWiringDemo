package com.autoWiringWithInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class EMpJPARepo implements IEmpRepo {
	
	@Value("Emp-jpa")
	private String model;

	@Autowired
	private IEmpRepo repo;
	
	@Override
	public String toString() {
		return "EMpJPARepo [model=" + model + "]";
	}

}
