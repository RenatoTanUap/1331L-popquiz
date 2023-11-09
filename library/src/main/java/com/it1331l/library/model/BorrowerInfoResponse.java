package com.it1331l.library.model;

import java.util.List;

public class BorrowerInfoResponse {
    List<StudentInfo> studentInfoList;

    public BorrowerInfoResponse(List<StudentInfo> studentInfoList) {
        this.studentInfoList = studentInfoList;
    }

    public List<StudentInfo> getStudentInfoList() {
        return studentInfoList;
    }

}
