package com.xxniu.app.singleton.hungry;

import com.xxniu.app.singleton.lazy.LazySingleTon;
import com.xxniu.app.singleton.thread.ExectorThread;

public class HungrySigletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

    }

}
