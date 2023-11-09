package com.it1331l.library.repository;

import com.it1331l.library.model.Book;
import com.it1331l.library.model.StudentInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MyBatisLibraryRepo {
    @Insert("INSERT INTO borrower_info(studentNumber, studentName) VALUES (#{studentNumber}, #{studentName})")
    public int insertStudentInfo(StudentInfo studentInfo);
    @Insert("INSERT INTO borrowed_books(bookCode, bookTitle, typeCode) VALUES (#{bookCode}, #{bookTitle}, #{typeCode})")
    public int insertBorrowedBook(Book book);

    // STUDENT INFORMATION QUERIES
    @Select("SELECT * FROM borrower_info")
    public List<StudentInfo> getAllStudentInfo();
    @Select("SELECT * FROM borrower_info WHERE studentNumber = #{studentNumber}")
    public List<StudentInfo> getAllStudentInfoByNumber(int studentNumber);
    @Select("SELECT * FROM borrower_info WHERE studentName = #{studentName}")
    public List<StudentInfo> getAllStudentInfoByName(String studentName);

    // BOOK QUERIES
    @Select("SELECT * FROM borrowed_books")
    public List<Book> getAllBorrowedBooks();
    @Select("SELECT * FROM borrowed_books WHERE bookTitle = #{bookTitle}")
    public List<Book> getAllBorrowedBooksByTitle(String bookTitle);
    @Select("SELECT * FROM borrowed_books WHERE bookCode = #{bookCode}")
    public List<Book> getAllBorrowedBooksByBookCode(String bookCode);
    @Select("SELECT * FROM borrowed_books WHERE typeCode = #{typeCode}")
    public List<Book> getBooksByTypeCode(String typeCode);

    @Delete("DELETE FROM borrowed_books WHERE bookCode = #{bookCode}")
    public int returnBook(String bookCode);
}
