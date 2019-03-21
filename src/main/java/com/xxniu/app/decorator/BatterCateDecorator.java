package com.xxniu.app.decorator;

/**
 * 装饰器类
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public abstract class BatterCateDecorator extends BatterCate {
	
	private BaseBatterCate baseBatterCate;
	
	protected abstract void doSomething();
	
	@Override
	public String getMsg() {
		return baseBatterCate.getMsg();
	}

	@Override
	public int price() {
		return baseBatterCate.price();
	}

}
