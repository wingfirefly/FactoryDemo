package com.xxniu.app.proxy;

import com.xxniu.app.proxy.dynamicproxy.DynamicMeiPo;
import com.xxniu.app.proxy.staticproxy.Father;
import com.xxniu.app.proxy.staticproxy.Person;
import com.xxniu.app.proxy.staticproxy.Son;

public class ProxyTest {
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
		
		DynamicMeiPo dmp = new DynamicMeiPo();
		Person obj = (Person) dmp.getInstance(new Son());
		obj.findLove();
	}
}
