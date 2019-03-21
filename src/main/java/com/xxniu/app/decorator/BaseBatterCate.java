package com.xxniu.app.decorator;

/**
 * 基础套餐
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public class BaseBatterCate extends BatterCate {

	@Override
	public String getMsg() {
		return "煎饼";
	}

	@Override
	public int price() {
		return 5;
	}

}
