package com.xxniu.app.singleton.lazy;

/**
 * 懒汉式双重锁实现
 * 线程安全的
 * 但是不能保证反射和反序列化破坏
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized(LazyDoubleCheckSingleton.class) {
                if (instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.设置instance指向刚分配的内存地址
                    // 以上三个步骤在jvm执行时会发生指令重排，如果231，在并发的情况下，还是会出现线程安全问题，所以要在定义的时候加上volatile关键字，防止指令重排
                }
            }
        }
        return instance;
    }

}
