package com.xxniu.app.FactoryDemo.abstractfactory;

/**
 * 模仿工厂类
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public class CubeFactory implements ICubeFactory {

	public ICube createFirstCube() {
		return new FirstCube();
	}

	public ICube createSecondCube() {
		return new SecondCube();
	}

}
