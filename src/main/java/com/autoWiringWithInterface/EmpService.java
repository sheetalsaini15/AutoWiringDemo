package com.autoWiringWithInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpService {
	
	@Value("Emp_ser")
	private String mode;
	
	@Autowired
	private IEmpRepo repo;

	@Override
	public String toString() {
		return "EmpService [mode=" + mode + ", repo=" + repo + "]";
	}

}
