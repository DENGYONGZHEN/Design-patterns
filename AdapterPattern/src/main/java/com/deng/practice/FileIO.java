package com.deng.practice;

import java.io.IOException;

/**
 * @Classname FileIO
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 22:03
 * @Created by helloDeng
 */
public interface FileIO {
    public void readFromFile(String fileName)throws IOException;
    public void writeToFile(String fileName)throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
