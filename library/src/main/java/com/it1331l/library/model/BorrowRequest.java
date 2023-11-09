package com.it1331l.library.model;

public class BorrowRequest {
    private int studentNumber;
    private String studentName;
    private Book[] listOfBooks;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Book[] getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(Book[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
}
