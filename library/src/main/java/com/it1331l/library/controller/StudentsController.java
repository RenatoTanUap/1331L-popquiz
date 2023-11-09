package com.it1331l.library.controller;

import com.it1331l.library.model.BorrowerInfoResponse;
import com.it1331l.library.repository.MyBatisLibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
    @Autowired
    MyBatisLibraryRepo libraryRepo;
    @GetMapping("students")
    public BorrowerInfoResponse getBorrowers() {
        BorrowerInfoResponse response = new BorrowerInfoResponse(libraryRepo.getAllStudentInfo());
        return response;
    }
    @GetMapping("students/name/{studentName}")
    public BorrowerInfoResponse getBorrowersByName(@PathVariable("studentName") String studentName) {
        String name = studentName.replace("%20", " ");
        BorrowerInfoResponse response = new BorrowerInfoResponse(libraryRepo.getAllStudentInfoByName(studentName));
        return response;
    }
    @GetMapping("students/number/{studentNumber}")
    public BorrowerInfoResponse getBorrowersByNumber(@PathVariable("studentNumber") int studentNumber) {
        BorrowerInfoResponse response = new BorrowerInfoResponse(libraryRepo.getAllStudentInfoByNumber(studentNumber));
        return response;
    }

}
