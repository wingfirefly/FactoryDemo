package com.xxniu.app.FactoryDemo.simplefactory;

public class CubeFactory {
	public ICube getCube(String className) {
		if ("FirstCube".equals(className)) {
			return new FirstCube();
		}else if ("SecondCube".equals(className)) {
			return new SecondCube();
		}
		return null;
	}
}
