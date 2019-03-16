package com.xxniu.app.proxy.staticproxy.meipo;

import com.xxniu.app.proxy.staticproxy.Person;

public class MeiPo {
	private Person obj;
	
	public MeiPo(Person obj) {
		this.obj = obj;
	}
	
	public void findLove() {
		before();
		obj.findLove();
		after();
	}

	private void after() {
		System.out.println("后置条件！");
	}

	private void before() {
		System.out.println("前置条件！");
	}

}
