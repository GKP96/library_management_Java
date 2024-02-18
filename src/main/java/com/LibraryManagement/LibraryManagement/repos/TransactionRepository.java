package com.LibraryManagement.LibraryManagement.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.LibraryManagement.models.Book;
import com.LibraryManagement.LibraryManagement.models.Student;
import com.LibraryManagement.LibraryManagement.models.Transaction;
import com.LibraryManagement.LibraryManagement.models.TransactionType;

public interface TransactionRepository extends  JpaRepository<Transaction, Integer>{
	
	//Transaction findByTransactionId(int id);
	
	//List<Transaction>  findByStudent(Student student);
	
//	List<Transaction> findByStudentAndBook(Student student, Book book);
	
//	List<Transaction>  findByStudentOrderById(Student student);// order by on trasnction id primary key
	
	
	//		//Q. find the lastest  transaction with student book and  trasnaction status should be TRANSCTION TYPE ISSUE
	
	
	
	List<Transaction> findByStudentAndBookAndTransactionTypeOrderByIdDesc(Student student, Book book, TransactionType transactionType);
	
	
	

}
