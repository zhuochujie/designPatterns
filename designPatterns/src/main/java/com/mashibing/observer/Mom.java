package com.mashibing.observer;

public class Mom implements Observer {
    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        hug();
    }
    public void hug(){
        System.out.println("mum hug ...");
    }
}
