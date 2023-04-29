package com.autoWiringWithInterface;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component

public class EmpIn  implements IEmpRepo{

	@Value("1234")
	private int empId;

	@Override
	public String toString() {
		return "EmpIn [empId=" + empId + "]";
	}
	
}
