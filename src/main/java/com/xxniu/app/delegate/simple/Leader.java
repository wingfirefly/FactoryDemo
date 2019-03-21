package com.xxniu.app.delegate.simple;

import com.xxniu.app.delegate.IWork;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IWork {

    private static Map<String, IWork> ioc = new HashMap<String, IWork>();

    static {
        ioc.put("加密", new EmployeeA());
        ioc.put("算法", new EmployeeB());
    }

    public void doing(String command) {
        ioc.get(command).doing(command);
    }
}
