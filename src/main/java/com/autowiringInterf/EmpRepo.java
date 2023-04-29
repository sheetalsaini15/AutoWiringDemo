package com.autowiringInterf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("erobj")
public class EmpRepo implements IEmpRepo{

	@Value("sheetaal emprepo")
	private String name;

	@Override
	public String toString() {
		return "EmpRepo [name=" + name + "]";
	}
	
	
}
