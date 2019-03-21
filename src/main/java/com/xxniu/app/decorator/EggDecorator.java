package com.xxniu.app.decorator;

/**
 * 鸡蛋套餐
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public class EggDecorator extends BatterCateDecorator {
	
	private BatterCate batterCate;
	
	public EggDecorator(BatterCate batterCate) {
		this.batterCate = batterCate;
	}
	
	@Override
	protected void doSomething() {
	}

	@Override
	public String getMsg() {
		return batterCate.getMsg() + "+1个鸡蛋";
	}

	@Override
	public int price() {
		return batterCate.price() + 1;
	}
}
