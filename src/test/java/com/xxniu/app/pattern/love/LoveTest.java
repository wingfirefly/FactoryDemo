package com.xxniu.app.pattern.love;

import com.xxniu.app.proxy.staticproxy.Father;
import com.xxniu.app.proxy.staticproxy.Son;

public class LoveTest {
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}
}
