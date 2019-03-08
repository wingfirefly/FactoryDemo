package com.xxniu.app.FactoryDemo.simplefactory;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		CubeFactory cf = new CubeFactory();
		ICube firstCube = cf.getCube("FirstCube");
		firstCube.cube();
		
		ICube secondCube = cf.getCube("SecondCube");
		secondCube.cube();
	}
}
