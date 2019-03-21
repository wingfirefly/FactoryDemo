package com.xxniu.app.deorator;

import com.xxniu.app.decorator.BaseBatterCate;
import com.xxniu.app.decorator.EggDecorator;
import com.xxniu.app.decorator.HotDogDecorator;

public class BatterCateDecoratorTest {
	public static void main(String[] args) {
		BaseBatterCate batterCate = new BaseBatterCate();
		EggDecorator eggDecorator = new EggDecorator(batterCate);
		EggDecorator eggDecorator1 = new EggDecorator(eggDecorator);
		HotDogDecorator hotDogDecorator = new HotDogDecorator(eggDecorator1);
		System.out.println(hotDogDecorator.getMsg());
		System.out.println("总价格：" + hotDogDecorator.price() + "元");
	}
}
