package com.deng;

/**
 * @Classname Support
 * @Description   用来解决问题的抽象类
 * @Version 1.0.0
 * @Date 2023/2/26 12:44
 * @Created by helloDeng
 */
public abstract class Support {
    private String name;       //解决问题的实例的名字
    private Support next;      //要推卸给的对象

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;                      //设置要推卸给的对象
        return next;
    }
    public final void support(Trouble trouble){          //解决问题的步骤
        if(resolve(trouble)){
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    private void done(Trouble trouble) {
        System.out.println(trouble + "is resloved by " + this);
    }    //已解决

    private void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved");
    } //未解决

    protected abstract boolean resolve(Trouble trouble);      //解决问题的方法

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
    
}
