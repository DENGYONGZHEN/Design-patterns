package com.deng;

import java.util.Scanner;

/**
 * @Classname TestFlyweightPattern
 * @Description  共享对象，避免浪费
 * @Version 1.0.0
 * @Date 2023/2/27 17:53
 * @Created by helloDeng
 */
public class TestFlyweightPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String next = scanner.next();
            BigString bigString = new BigString(next);
            bigString.print();
        }


    }
}
