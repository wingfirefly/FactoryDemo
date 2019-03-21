package com.xxniu.app.delegate;

import com.xxniu.app.delegate.simple.Boss;
import com.xxniu.app.delegate.simple.Leader;

public class delegateSimpleTest {

    public static void main(String[] args) {
        Boss boss = new Boss(new Leader());
        boss.doing("加密");
    }
}
