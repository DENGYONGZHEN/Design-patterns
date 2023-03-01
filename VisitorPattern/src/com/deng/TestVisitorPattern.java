package com.deng;

/**
 * @Classname TestVisitorPattern
 * @Description  访问数据结构并处理数据
 * @Version 1.0.0
 * @Date 2023/2/26 11:41
 * @Created by helloDeng
 */
public class TestVisitorPattern {
    public static void main(String[] args) {
        try{
            System.out.println("Making root entries....");
            Directory root = new Directory("root");
            Directory bin = new Directory("bin");
            Directory tmp = new Directory("tmp");
            Directory usr = new Directory("usr");
            root.add(bin);
            root.add(tmp);
            root.add(usr);

            bin.add(new File("vi",10000));
            bin.add(new File("latex",20000));

            root.accept(new ListVisitor());

            System.out.println("");
            System.out.println("making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");

            usr.add(yuki);
            usr.add(hanako);
            usr.add(tomura);

            yuki.add(new File("diary.html",100));
            yuki.add(new File("Composite.java",200));
            hanako.add(new File("memo.text",300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            root.accept(new ListVisitor());
        }catch (FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
