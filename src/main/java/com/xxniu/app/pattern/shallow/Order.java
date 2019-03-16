package com.xxniu.app.pattern.shallow;

import java.util.Map;

public class Order implements Cloneable{
	private int id;
	private String orderNo;
	private Map<String, Object> storeMap;
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

	public Map<String, Object> getStoreMap() {
		return storeMap;
	}

	public void setStoreMap(Map<String, Object> storeMap) {
		this.storeMap = storeMap;
	}

	public IndInfo getIndInfo() {
		return indInfo;
	}
	/**
	 * 浅复制 indInfo对象和Map对象都是同一个
	 */
	@Override
	protected Order clone() throws CloneNotSupportedException {
		return (Order) super.clone();
	}

	public void setIndInfo(IndInfo indInfo) {
		this.indInfo = indInfo;
	}
}
