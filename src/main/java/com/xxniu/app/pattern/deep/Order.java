package com.xxniu.app.pattern.deep;

import java.util.HashMap;

public class Order implements Cloneable{
	private int id;
	private String orderNo;
	private HashMap<String, Object> storeMap;
	private IndInfo indInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public HashMap<String, Object> getStoreMap() {
		return storeMap;
	}

	public void setStoreMap(HashMap<String, Object> storeMap) {
		this.storeMap = storeMap;
	}

	public IndInfo getIndInfo() {
		return indInfo;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Order clone() throws CloneNotSupportedException {
		Order order = (Order) super.clone();
		order.setIndInfo(this.getIndInfo().clone());
		order.setStoreMap((HashMap<String, Object>)this.getStoreMap().clone());
		return order;
	}

	public void setIndInfo(IndInfo indInfo) {
		this.indInfo = indInfo;
	}
}
