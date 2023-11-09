package com.it1331l.library.controller;

import com.it1331l.library.model.*;
import com.it1331l.library.repository.MyBatisLibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class BorrowController {

    @Autowired
    MyBatisLibraryRepo libraryRepo;

    @PostMapping("/borrow")
    public BorrowResponse borrowBook(@RequestBody BorrowRequest request) {
        StudentInfo studentInfo = new StudentInfo(request.getStudentNumber(), request.getStudentName());
        BorrowResponse response = new BorrowResponse(studentInfo, request.getListOfBooks());
        libraryRepo.insertStudentInfo(studentInfo);
        for (Book book: request.getListOfBooks()) {
            libraryRepo.insertBorrowedBook(book);
        }
        return response;
    }
}
