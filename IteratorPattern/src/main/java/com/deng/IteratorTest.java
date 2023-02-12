package com.deng;

/**
 * @Classname IteratorTest
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 12:07
 * @Created by helloDeng
 *
 * 引入Iterator可以将遍历与遍历的实现分离开来，while循环不依赖BookShelf的实现，只要返回的Iterator类的实例没有问题
 * Aggregate是负责定义创建Iterator的接口，属于集合
 * BookShelf实现了Aggregate接口，属于集合
 * Iterator是一个迭代器接口
 * BookshelfIterator实现了Iterator接口，是具体迭代器，把需要遍历的BookShelf的实例作为成员变量保存，迭代器就可以拿着这个成员变量进行遍历操作
 * 而for循环是集合自己在进行遍历
 * 设计模式：帮助编写可复用的类，也就是组件化
 * 不要只使用具体类来编程，要优先使用抽象类和接口来编程
 *
 */
public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("深入理解java虚拟机"));
        bookShelf.appendBook(new Book("算法导论"));
        bookShelf.appendBook(new Book("操作系统"));
        bookShelf.appendBook(new Book("计算机网络"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
