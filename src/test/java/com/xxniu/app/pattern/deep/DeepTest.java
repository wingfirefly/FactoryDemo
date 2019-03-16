package com.xxniu.app.pattern.deep;

import java.util.HashMap;

public class DeepTest {
	public static void main(String[] args) {
		Order order = new Order();
		IndInfo indInfo = new IndInfo();
		HashMap<String, Object> storeMap = new HashMap<String, Object>();
		order.setId(1);
		order.setOrderNo("111");
		order.setIndInfo(indInfo);
		order.setStoreMap(storeMap);
		
		try {
			Order order1 = order.clone();
			System.out.println(order.getIndInfo()==order1.getIndInfo());
			System.out.println(order.getStoreMap()==order1.getStoreMap());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
