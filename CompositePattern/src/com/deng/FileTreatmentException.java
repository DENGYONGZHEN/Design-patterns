package com.deng;

/**
 * @Classname FileTreatmentException
 * @Description         表示向文件夹中增加Entry时发生的异常的类
 * @Version 1.0.0
 * @Date 2023/2/20 16:07
 * @Created by helloDeng
 */
public class FileTreatmentException extends RuntimeException{
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg){
        super(msg);
    }
}
