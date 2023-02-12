package com.deng.practice;

import java.io.*;
import java.util.Properties;

/**
 * @Classname FileProperties
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 22:08
 * @Created by helloDeng
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {

        load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
         store(new FileOutputStream(fileName),"新文件");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getValue(key);
    }
}
