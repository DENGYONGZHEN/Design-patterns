package com.deng.practice;


/**
 * @Classname IteratorTest
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 12:07
 * @Created by helloDeng
 *
 * 引入Iterator可以将遍历与遍历的实现分离开来，while循环不依赖BookShelf的实现，只要返回的Iterator类的实例没有问题
 * 设计模式：帮助编写可复用的类，也就是组件化
 * 不要只使用具体类来编程，要优先使用抽象类和接口来编程
 *
 */
public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("深入理解java虚拟机"));
        bookShelf.appendBook(new Book("算法导论"));
        bookShelf.appendBook(new Book("操作系统"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("设计模式"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
