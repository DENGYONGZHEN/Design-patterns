package com.deng;

/**
 * @Classname ConcreteColleague1
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 15:59
 * @Created by helloDeng
 */
public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void getMessage(String message){
        System.out.println("ConcreteColleague1 获得对方信息： " +message);
    }
}
