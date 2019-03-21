package com.xxniu.app.FactoryDemo.abstractfactory;

/**
 * 魔方工厂顶层接口
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public interface ICubeFactory {
	ICube createFirstCube();
	ICube createSecondCube();
}
