package com.info.inheritance;

public final class Book {

    final int bookId;
    final String bookName;
    final String bookCode;
    final String WriterName;

    public Book(int bookId, String bookName, String bookCode, String writerName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.WriterName = writerName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getWriterName() {
        return WriterName;
    }


}
