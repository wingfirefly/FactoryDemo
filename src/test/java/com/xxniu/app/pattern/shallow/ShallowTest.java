package com.xxniu.app.pattern.shallow;

import java.util.HashMap;
import java.util.Map;

public class ShallowTest {
	public static void main(String[] args) {
		Order order = new Order();
		IndInfo indInfo = new IndInfo();
		Map<String, Object> storeMap = new HashMap<String, Object>();
		order.setId(1);
		order.setOrderNo("111");
		order.setIndInfo(indInfo);
		order.setStoreMap(storeMap);
		try {
			Order order1 = order.clone();
//			System.out.println(order1.getStoreMap().get("111"));
//			System.out.println(order.getStoreMap().get("111"));
//			storeMap.put("111", "111");
//			System.out.println(order1.getStoreMap().get("111"));
//			System.out.println(order.getStoreMap().get("111"));
			
			System.out.println(order.getIndInfo());
			System.out.println(order1.getIndInfo());
			order.setOrderNo("222");
			System.out.println(order1.getOrderNo());
			System.out.println(order.getIndInfo()==order1.getIndInfo());
			System.out.println(order.getStoreMap()==order1.getStoreMap());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
