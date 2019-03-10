package com.xxniu.app.singleton.register;

public enum EnumSingleton {
    INSTANCE;
    private EnumSingleton(){

    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
