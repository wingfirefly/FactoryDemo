package com.xxniu.app.proxy.staticproxy;

public class Father implements Person {

	private Person person;

	public Father(Person person) {
		this.person = person;
	}

	public void findLove() {
		before();
		person.findLove();
		after();
	}

	private void after() {
		System.out.println("后置条件！");
	}

	private void before() {

		System.out.println("前置条件！");
	}

}
