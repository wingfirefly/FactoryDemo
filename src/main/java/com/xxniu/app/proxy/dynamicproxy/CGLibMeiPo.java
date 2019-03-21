package com.xxniu.app.proxy.dynamicproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLib动态代理
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public class CGLibMeiPo implements MethodInterceptor{
	
	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return (Object) enhancer.create();
	}

	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		before();
		Object obj = arg3.invokeSuper(arg0, arg2);
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
