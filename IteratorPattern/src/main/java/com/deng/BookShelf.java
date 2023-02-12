package com.deng;

/**
 * @Classname BookShelf        实体类书架
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 11:57
 * @Created by helloDeng
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    //last记录书的数量
    private int last = 0;
    //通过构造函数初始化私有字段
    public BookShelf(int maxSize){
        books = new Book[maxSize];
    }
    public Book getBook(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator(){
        return new BookshelfIterator(this);
    }
}
