package com.xxniu.app.proxy.staticproxy;

import java.util.HashMap;
import java.util.Map;

import com.xxniu.app.proxy.dynamicproxy.DynamicMeiPo;

public class StaticProxyTest {
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
		
		DynamicMeiPo dmp = new DynamicMeiPo();
		Person obj = (Person) dmp.getInstance(new Son());
		obj.findLove();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("1", "10000.000001");
		double d = Double.parseDouble((map.get("1") + ""));
		System.out.println(d);
	}
}
