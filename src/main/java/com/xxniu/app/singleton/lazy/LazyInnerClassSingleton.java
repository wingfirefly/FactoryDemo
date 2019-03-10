package com.xxniu.app.singleton.lazy;

/**
 * 懒汉式内部类实现
 * 线程安全的
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (InnerClass.instance != null){
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    /**
     * 默认不加载 在调用时加载
     */
    private static class InnerClass{
        // static 是保证单例的内存空间共享
        // final 是为了不被重写 覆盖
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();

        private InnerClass(){}
    }

}
