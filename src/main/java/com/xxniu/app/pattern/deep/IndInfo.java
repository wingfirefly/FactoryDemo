package com.xxniu.app.pattern.deep;

public class IndInfo implements Cloneable{
	private int id;
	private String customerId;
	private String customerName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	protected IndInfo clone() throws CloneNotSupportedException {
		return (IndInfo) super.clone();
	}
	
}
