package com.deng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname NumberGenerator
 * @Description 表示生成数值的对象的抽象类
 * @Version 1.0.0
 * @Date 2023/2/26 16:41
 * @Created by helloDeng
 */
public abstract class NumberGenerator {
    private List observers = new ArrayList();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer next = (Observer) iterator.next();
            next.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
