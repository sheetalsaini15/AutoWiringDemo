package com.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("aob")
public class Address {
	
	@Value("Pathanchack")
	String  hno;
	@Value("Chandigarh")
	String loc;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
	

}
