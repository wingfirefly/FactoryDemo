package com.xxniu.app.delegate.simple;

import com.xxniu.app.delegate.IWork;

public class EmployeeA implements IWork {
    public void doing(String command) {
        System.out.println("员工A开始做" + command + "工作！");
    }
}
