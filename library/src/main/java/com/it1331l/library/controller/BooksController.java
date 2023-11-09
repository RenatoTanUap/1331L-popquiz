package com.it1331l.library.controller;

import com.it1331l.library.model.BorrowedBooksResponse;
import com.it1331l.library.repository.MyBatisLibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
    @Autowired
    MyBatisLibraryRepo libraryRepo;

    @GetMapping("books")
    public BorrowedBooksResponse getBorrowedBooks() {
        BorrowedBooksResponse response = new BorrowedBooksResponse(libraryRepo.getAllBorrowedBooks());
        return response;
    }
    @GetMapping("books/title/{bookTitle}")
    public BorrowedBooksResponse getBorrowedBooksByTitle(@PathVariable("bookTitle") String bookTitle) {
        String title = bookTitle.replace("%20", " ");
        BorrowedBooksResponse response = new BorrowedBooksResponse(libraryRepo.getAllBorrowedBooksByTitle(title));
        return response;
    }
    @GetMapping("books/code/{bookCode}")
    public BorrowedBooksResponse getBorrowedBooksByBookCode(@PathVariable("bookCode") String bookCode) {
        BorrowedBooksResponse response = new BorrowedBooksResponse(libraryRepo.getAllBorrowedBooksByBookCode(bookCode));
        return response;
    }
    @GetMapping("books/type/{typeCode}")
    public BorrowedBooksResponse getBorrowedBooksByTypeCode(@PathVariable("typeCode") String typeCode) {
        BorrowedBooksResponse response = new BorrowedBooksResponse(libraryRepo.getBooksByTypeCode(typeCode));
        return response;
    }
}
