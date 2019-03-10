package com.xxniu.app.singleton.thread;

import com.xxniu.app.singleton.lazy.LazyDoubleCheckSingleton;
import com.xxniu.app.singleton.lazy.LazySingleTon;

public class ExectorThread implements Runnable{

    public void run() {
//        LazySingleTon singleTon = LazySingleTon.getInstance();
        LazyDoubleCheckSingleton singleTon = LazyDoubleCheckSingleton.getInstance();
//        LazySingleTon singleTon = LazySingleTon.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleTon);
    }
}
