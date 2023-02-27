package com.deng;

/**
 * @Classname TestMediatorPattern
 * @Description  中介者模式
 * @Version 1.0.0
 * @Date 2023/2/26 14:50
 * @Created by helloDeng
 *
 * 中介者模式：用一个中介对象来封装一系列的的对象交互。中介者使各对象不需要显示的相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互
 *
 * 由于ConcreteMediator控制了集中化，于是就把交互复杂
 * 性变为了中介者的复杂性，这就使得中介者会变得比任何一个
 * ConcreteColleague都复杂。
 */
public class TestMediatorPattern {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("不准研发核武器，否则发动战争");
        colleague2.send("没有核武器，不怕战争");
    }
}
