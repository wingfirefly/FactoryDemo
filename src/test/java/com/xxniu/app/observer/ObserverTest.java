package com.xxniu.app.observer;

import com.xxniu.app.observer.simple.GPer;
import com.xxniu.app.observer.simple.Question;
import com.xxniu.app.observer.simple.Teacher;

public class ObserverTest {
	public static void main(String[] args) {
		GPer gper = GPer.getIntiance();
		Teacher mic = new Teacher("mic");
		Teacher tom = new Teacher("tom");
		
		Question question = new Question();
		question.setUserName("小明");
		question.setContent("观察者模式适用场景？");
		
		gper.addObserver(tom);
		gper.addObserver(mic);
		gper.publishQuestion(question);
	}
}
