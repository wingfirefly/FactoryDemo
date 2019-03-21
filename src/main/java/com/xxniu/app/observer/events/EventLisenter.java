package com.xxniu.app.observer.events;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器，它就是观察者的桥梁
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public class EventLisenter {
	protected Map<String, Event> events = new HashMap<>();
	public void addLisenter(String eventType, Object target) {
		try {
			// 使用反射，将回调函数注册到Method对象里，和target（MouseEventCallback）封装成Event
			this.addLisenter(eventType, target,
					target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 将回调类和回调方法一起注册到map中，事件触发的时候，直接调用map中注册函数就可以完成回调通知。
	 *
	 * @Title EventLisenter.addLisenter
	 *
	 * @param eventType
	 * @param target
	 * @param callback
	 */
	public void addLisenter(String eventType, Object target, Method callback) {
		events.put(eventType, new Event(target, callback));
	}
	
	private void trigger(Event event) {
		event.setSource(this);
		event.setTime(System.currentTimeMillis());
		try {
			if (event.getCallback() != null) {
				event.getCallback().invoke(event.getTarget(), event);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void trigger(String trigger) {
		if (!this.events.containsKey(trigger)) {
			return;
		}
		trigger(this.events.get(trigger).setTrigger(trigger));
	}
	
	//逻辑处理的私有方法，首字母大写 
	private String toUpperFirstCase(String str) {
		char[] chars = str.toCharArray();
		chars[0] -= 32;
		return String.valueOf(chars);
	}
	
}
