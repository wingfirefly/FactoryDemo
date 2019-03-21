package com.xxniu.app.observer;

import com.xxniu.app.observer.events.Mouse;
import com.xxniu.app.observer.events.MouseEventCallback;
import com.xxniu.app.observer.events.MouseEventType;

public class EventTest {
	public static void main(String[] args) {
		MouseEventCallback callback = new MouseEventCallback();
		
		//注册事件 
		Mouse mouse = new Mouse();
		mouse.addLisenter(MouseEventType.ON_CLICK, callback);
		mouse.addLisenter(MouseEventType.ON_MOVE, callback);
		mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
		mouse.addLisenter(MouseEventType.ON_OVER, callback);
		
		mouse.click();
		

	}
}
