package com.deng;

/**
 * @Classname Support
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 12:44
 * @Created by helloDeng
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    public final void support(Trouble trouble){
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
    }

    private void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved");
    }

    protected abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
    
}
