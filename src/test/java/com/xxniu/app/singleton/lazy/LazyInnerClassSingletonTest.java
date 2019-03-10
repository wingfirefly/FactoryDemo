package com.xxniu.app.singleton.lazy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class clazz = LazyInnerClassSingleton.class;
        try {
            // 反射案例
//            LazyInnerClassSingleton singleton = (LazyInnerClassSingleton)clazz.getDeclaredConstructor(null).newInstance();
            Constructor constructor = clazz.getDeclaredConstructor(null);
            // 如果不设置true private构造方法是禁止访问的
            constructor.setAccessible(true);
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1==o2);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
