package com.xxniu.app.FactoryDemo.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		ICubeFactory cf = new CubeFactory();
		ICube fc = cf.createFirstCube();
		fc.cube();
		ICube sc = cf.createSecondCube();
		sc.cube();
	}
}
