package com.deng;

/**
 * @Classname ConcreteColleague2
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 16:03
 * @Created by helloDeng
 */
public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void getMessage(String message){
        System.out.println("ConcreteColleague2 获得对方信息： " +message);
    }




}
