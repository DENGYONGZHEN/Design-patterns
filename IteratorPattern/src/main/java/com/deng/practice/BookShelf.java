package com.deng.practice;





import java.util.ArrayList;
import java.util.List;

/**
 * @Classname BookShelf
 * @Description 练习题  用集合代替数组
 * @Version 1.0.0
 * @Date 2023/2/12 12:37
 * @Created by helloDeng
 */
public class BookShelf implements Aggregate {
    private List<Book> books;
    public BookShelf(){
        books = new ArrayList<Book>();
    };
    public void appendBook(Book book){
        books.add(book);
    }
    public Book getBook(int index){
        return books.get(index);
    }
    public int getLength(){
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }


}
