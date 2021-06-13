package com.shrinkme.bean;

public class AddressBean {
	private String city;
	private String state;
	public AddressBean(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}
