package com.xxniu.app.singleton.hungry;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    /**
	 * 说明: 
	 * 类型:long 名称:serialVersionUID  
	 */
	private static final long serialVersionUID = 1L;
	private static final SeriableSingleton instance = new SeriableSingleton();
    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
