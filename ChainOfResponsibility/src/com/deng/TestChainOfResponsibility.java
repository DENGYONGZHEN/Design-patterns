package com.deng;

/**
 * @Classname TestChainOfResponsibility
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 12:36
 * @Created by helloDeng
 */
public class TestChainOfResponsibility {
    public static void main(String[] args) {
        Support alice = new NoSupport("alice");
        Support bob = new LimitSupport("Bob",100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for (int i = 0; i < 500; i++) {
            alice.support(new Trouble(i));
        }
    }
}
