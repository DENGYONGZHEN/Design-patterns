package com.deng;

/**
 * @Classname TestStatePattern
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/27 16:41
 * @Created by helloDeng
 */
public class TestStatePattern {
    public static void main(String[] args) {
        SafeFrame sample = new SafeFrame("State Sample");
        while (true){
            for (int hour = 0; hour < 24; hour++) {
                sample.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
