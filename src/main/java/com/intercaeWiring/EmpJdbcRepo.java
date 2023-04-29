 package com.intercaeWiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("embobj")
public class EmpJdbcRepo implements IEmpRepo {

	 @Value("empname")
	private String name;
}
