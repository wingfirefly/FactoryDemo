package com.xxniu.app.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.xxniu.app.proxy.staticproxy.Person;

public class DynamicMeiPo implements InvocationHandler{
	
	private Person obj;
	
	public Person getInstance(Person obj) {
		this.obj = obj;
		Class<?> clazz = obj.getClass();
		return (Person) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object obj = method.invoke(this.obj, args);
		after();
		return obj;
	}

	private void after() {
		System.out.println("后置条件！");
	}

	private void before() {
		System.out.println("前置条件！");
	}
}
