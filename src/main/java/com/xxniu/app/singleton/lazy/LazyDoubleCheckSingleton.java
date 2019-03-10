package com.xxniu.app.singleton.lazy;

/**
 * 懒汉式双重锁实现
 * 线程安全的
 * 但是不能保证反射和反序列化破坏
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized(LazyDoubleCheckSingleton.class) {
                if (instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    // 分配内存给这个对象
                    // 初始化对象
                    // 设置instance指向刚分配的内存地址
                }
            }
        }
        return instance;
    }

}
