package com.xxniu.app.singleton.register;

/**
 * 枚举实现单例
 * 说明: TODO
 * @author niuxinxing
 * @version
 */
public enum EnumSingleton {
    INSTANCE;
    private EnumSingleton(){

    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
