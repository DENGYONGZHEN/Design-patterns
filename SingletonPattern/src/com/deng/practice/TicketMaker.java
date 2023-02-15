package com.deng.practice;

/**
 * @Classname TicketMaker
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/15 14:42
 * @Created by helloDeng
 */
public class TicketMaker {
    @Override
    public String toString() {
        return "TicketMaker{" +
                "ticketNum=" + ticketNum +
                '}';
    }

    public int ticketNum = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker(){

    }
    public static TicketMaker getInstance(){
        return ticketMaker;
    }
    //线程安全
    public synchronized int getNextTicketNumber(){
        return ticketNum++;
    }
}
