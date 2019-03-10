package com.xxniu.app.singleton.hungry;

/**
 * 饿汉式单例静态块实现
 */
public class HungryStaticSingleton {

    private static HungryStaticSingleton instance = null;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return instance;
    }
}
