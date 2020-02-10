package com.mashibing.observer;

import java.util.ArrayList;
import java.util.List;

public class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
        //钩子函数 其实也是观察者模式
        observers.add((e)->{
            System.out.println(e);
                }
        );
    }
    public boolean isCry(){
        return cry;
    }
    public void wakeUp(){
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed",this);
        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}
