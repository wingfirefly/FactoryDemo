package com.xxniu.app.observer.simple;

import java.util.Observable;

public class GPer extends Observable {

	private static volatile GPer gper = null;

	private String name = "Gper生态圈";

	private GPer() {
	}

	public static GPer getIntiance() {
		if (gper == null) {
			synchronized (GPer.class) {
				if (gper == null) {
					gper = new GPer();
				}
			}
		}
		return gper;
	}

	public void publishQuestion(Question question) {
		System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
		setChanged();
		notifyObservers(question);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
