package com.xxniu.app.FactoryDemo.abstractfactory;

public class CubeFactory implements ICubeFactory {

	public ICube createFirstCube() {
		return new FirstCube();
	}

	public ICube createSecondCube() {
		return new SecondCube();
	}

}
