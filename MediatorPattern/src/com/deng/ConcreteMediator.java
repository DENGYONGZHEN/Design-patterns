package com.deng;

/**
 * @Classname ConcreteMediator
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 16:07
 * @Created by helloDeng
 */
public class ConcreteMediator extends Mediator{
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleague1){
            colleague2.getMessage(message);
        }else {
            colleague1.getMessage(message);
        }
    }
}
