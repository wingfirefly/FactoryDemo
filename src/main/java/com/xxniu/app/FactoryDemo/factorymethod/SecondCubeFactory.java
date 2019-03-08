package com.xxniu.app.FactoryDemo.factorymethod;

public class SecondCubeFactory implements ICubeFactory {

	public ICube createCube() {
		return new SecondCube();
	}

}
