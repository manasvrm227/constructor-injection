package com.shrinkme.bean;

import java.util.List;

public class EmployeeBean {

	private int id;
	private String name;
	private List<AddressBean> addressBean;

	public EmployeeBean(int id, String name, List<AddressBean> addressBean) {
		super();
		this.id = id;
		this.name = name;
		this.addressBean = addressBean;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", addressBean=" + addressBean + "]";
	}

}
