package com.info.inheritance;

public  class FinalExample {
    final int a = 50;
    public int bookId;
    public String bookName;

    public int getBookId() {

        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public final void setBookName(String bookName) {
        this.bookName = bookName;
    }
}

class BookExten extends FinalExample{
//    public  void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//        System.out.println("hello");
//    }
}