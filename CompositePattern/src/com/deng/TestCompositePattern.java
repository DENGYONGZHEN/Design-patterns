package com.deng;

/**
 * @Classname TestCompositePattern
 * @Description        容器与内容的一致性
 * @Version 1.0.0
 * @Date 2023/2/20 15:42
 * @Created by helloDeng
 *
 * CompositePattern 能够使容器与内容具有一致性，创造出递归模式
 * Entry是抽象类是Directory文件夹和File文件的父类，
 * 不管是Directory的实例还是File的实例，都是Entry类型的实例
 * 定义的printList和getSize都是可以递归调用的
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);

            yuki.add(new File("diary.html", 100));
            yuki.add(new File("composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            rootdir.printList();
        }catch (FileTreatmentException e){
            e.printStackTrace();
        }

    }
}
