package com.xxniu.app.FactoryDemo.factorymethod;

public class FirstCubeFactory implements ICubeFactory {

	public ICube createCube() {
		return new FirstCube();
	}
	
}
