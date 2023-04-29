package com.autowiringPRa.AutoWiringPr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {
	
	@Value("hs123")
	private String hno;
	@Value("Pathankot")
	private String city;
	@Value("Punjab")
	private String state;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
