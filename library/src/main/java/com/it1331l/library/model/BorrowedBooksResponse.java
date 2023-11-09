package com.it1331l.library.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BorrowedBooksResponse {
    private List<Book> bookList;

    public BorrowedBooksResponse(List<Book> bookList) {
        Collections.sort(bookList);
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
