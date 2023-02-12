package com.deng.practice;



/**
 * @Classname BookshelfIterator  具体的迭代器  和 BookShelf 相对应
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 12:02
 * @Created by helloDeng
 */
public class BookshelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookshelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    //返回当前元素并指向下一个元素
    @Override
    public boolean hasNext() {
        if(index< bookShelf.getLength()){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Book next() {
        Book book = bookShelf.getBook(index);
        index++;
        return book;
    }
}
