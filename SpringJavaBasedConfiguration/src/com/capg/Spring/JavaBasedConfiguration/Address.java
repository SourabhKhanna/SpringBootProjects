package com.capg.Spring.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {

	@Value("hyd")
	private String cityName;
	@Value("tel")
	private String stateName;
	@Value("india")
	private String countryName;
	
//	public String getCityName() {
//		return cityName;
//	}
//	public void setCityName(String cityName) {
//		System.out.println("setting");
//		this.cityName = cityName;
//	}
//	public String getStateName() {
//		return stateName;
//	}
//	public void setStateName(String stateName) {
//		this.stateName = stateName;
//	}
//	public String getCountryName() {
//		return countryName;
//	}
//	public void setCountryName(String countryName) {
//		this.countryName = countryName;
//	}
	
	
	@Override
	public String toString() {
		return cityName + " " +stateName + " " +countryName;
	}
	
}
