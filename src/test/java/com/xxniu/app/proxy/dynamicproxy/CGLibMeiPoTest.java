package com.xxniu.app.proxy.dynamicproxy;

import com.xxniu.app.proxy.staticproxy.Person;

public class CGLibMeiPoTest {

    public static void main(String[] args) {
        CGLibMeiPo cgLibMeiPo = new CGLibMeiPo();
        Class clazz = Customer.class;
        Customer obj = (Customer) cgLibMeiPo.getInstance(clazz);
        obj.findLove();
    }
}
