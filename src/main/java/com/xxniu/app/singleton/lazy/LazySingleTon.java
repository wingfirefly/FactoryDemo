package com.xxniu.app.singleton.lazy;

/**
 * 懒汉式
 * 非线程安全的
 */
public class LazySingleTon {

    private static LazySingleTon instance = null;

    private LazySingleTon(){

    }

    public static LazySingleTon getInstance(){
        if (instance == null){
            instance = new LazySingleTon();
        }
        return instance;
    }

}
