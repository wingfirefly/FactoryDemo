package com.xxniu.app.delegate.simple;

import com.xxniu.app.delegate.IWork;

public class Boss implements IWork {
    private Leader leader;
    public Boss(){

    }

    public Boss(Leader leader){
        this.leader = leader;
    }

    public void doing(String command) {
        leader.doing(command);
    }
}
