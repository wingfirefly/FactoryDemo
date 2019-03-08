package com.xxniu.app.FactoryDemo.secondfactory;

import com.xxniu.app.FactoryDemo.factorymethod.FirstCubeFactory;
import com.xxniu.app.FactoryDemo.factorymethod.ICube;
import com.xxniu.app.FactoryDemo.factorymethod.ICubeFactory;
import com.xxniu.app.FactoryDemo.factorymethod.SecondCubeFactory;

public class SecondFactoryTest {
	public static void main(String[] args) {
		ICubeFactory fcf = new FirstCubeFactory();
		ICube fc = fcf.createCube();
		fc.cube();
		
		ICubeFactory scf = new SecondCubeFactory();
		ICube sc = scf.createCube();
		sc.cube();
	}
}
