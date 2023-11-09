package com.it1331l.library.model;

public class Book implements Comparable<Book> {
    private String bookCode;
    private String bookTitle;
    private String typeCode;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
    @Override
    public int compareTo(Book book) {
        return this.bookTitle.compareTo(book.getBookTitle());
    }
}
