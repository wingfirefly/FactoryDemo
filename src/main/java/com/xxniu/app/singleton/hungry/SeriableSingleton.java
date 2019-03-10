package com.xxniu.app.singleton.hungry;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private static final SeriableSingleton instance = new SeriableSingleton();
    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
