package com.it1331l.library.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BorrowResponse {
    private StudentInfo studentInformation;
    private int bookCount;
    private List<Book> orderedBookList;

    public BorrowResponse(StudentInfo studentInfo, Book[] bookList) {
        this.studentInformation = studentInfo;
        List<Book> newListOfBooks = new ArrayList<Book>();
        newListOfBooks.addAll(Arrays.asList(bookList));
        Collections.sort(newListOfBooks);
        this.orderedBookList = newListOfBooks;
        this.bookCount = this.orderedBookList.size();
    }
    public StudentInfo getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(StudentInfo studentInformation) {
        this.studentInformation = studentInformation;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public List<Book> getOrderedBookList() {
        return orderedBookList;
    }

    public void setOrderedBookList(List<Book> orderedBookList) {
        this.orderedBookList = orderedBookList;
    }
}
