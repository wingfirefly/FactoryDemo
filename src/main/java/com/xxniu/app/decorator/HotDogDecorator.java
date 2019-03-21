package com.xxniu.app.decorator;

/**
 * 热狗套餐
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public class HotDogDecorator extends BatterCateDecorator {

	private BatterCate batterCate;
	
	public HotDogDecorator(BatterCate batterCate) {
		this.batterCate = batterCate;
	}
	
	@Override
	protected void doSomething() {
		
	}

	@Override
	public String getMsg() {
		return batterCate.getMsg() + "+1根香肠";
	}

	@Override
	public int price() {
		return batterCate.price() + 2;
	}

	
	
}
