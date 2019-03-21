package com.xxniu.app.delegate.simple;

import com.xxniu.app.delegate.IWork;

public class EmployeeB implements IWork {
    public void doing(String command) {
        System.out.println("员工B开始做" + command + "的工作");
    }
}
