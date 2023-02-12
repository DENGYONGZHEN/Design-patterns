package com.deng.practice;

import java.io.IOException;

/**
 * @Classname FileTest
 * @Description               这里io流需要复习一下
 * @Version 1.0.0
 * @Date 2023/2/12 22:15
 * @Created by helloDeng
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        FileIO io = new FileProperties();
        io.readFromFile("file.text");
        io.writeToFile("newFile.text");
    }
}
