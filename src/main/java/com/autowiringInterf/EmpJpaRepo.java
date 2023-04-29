package com.autowiringInterf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class EmpJpaRepo  implements IEmpRepo{
	
	@Value("sainilname")
	private String lastName;

	@Override
	public String toString() {
		return "EmpJpaRepo [lastName=" + lastName + "]";
	}
	
	
	
	
	

}
