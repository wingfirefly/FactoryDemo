package com.xxniu.app.adapter;

public class AdapterTest {
	public static void main(String[] args) {
		AC220 ac220 = new AC220();
		DC5 dc5 = new PowerAdapter(ac220);
		dc5.outputDC5();
	}
}
