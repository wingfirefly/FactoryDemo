package com.xxniu.app.proxy;

import com.xxniu.app.proxy.dynamicproxy.CGLibMeiPo;
import com.xxniu.app.proxy.dynamicproxy.Customer;

public class CGLibMeiPoTest {

    public static void main(String[] args) {
        CGLibMeiPo cgLibMeiPo = new CGLibMeiPo();
        Class<Customer> clazz = Customer.class;
        Customer obj = (Customer) cgLibMeiPo.getInstance(clazz);
        obj.findLove();
    }
}
