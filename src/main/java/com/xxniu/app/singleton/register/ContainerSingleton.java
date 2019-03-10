package com.xxniu.app.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static final Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton(){}

    public static Object getBean(String beanName){
        synchronized (ioc) {
            if (ioc.get(beanName) != null){
                Object obj = null;
                try {
                    obj = Class.forName(beanName).newInstance();
                    ioc.put(beanName, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
        }
        return ioc.get(beanName);
    }
}
