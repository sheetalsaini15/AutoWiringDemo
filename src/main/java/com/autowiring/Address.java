package com.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("aob")
public class Address {
	
	@Value("3210")
	String  hno;
	@Value("Chd")
	String loc;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
	

}
