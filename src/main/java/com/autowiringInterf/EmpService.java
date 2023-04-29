package com.autowiringInterf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("eob")
public class EmpService {
	
	@Value("mode123")
	private String mode;
	
	@Autowired
	//@Qualifier("erobj")
	@Qualifier("empJpaRepo")
	private IEmpRepo erobj;
	
	@Override
	public String toString() {
		return "EmpService [mode=" + mode + ", irepo=" + erobj + "]";
	}


	

}
