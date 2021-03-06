package com.venus.spring.service;

import java.util.List;

import com.venus.spring.model.Book;

public interface BookService {
	//	Save the record
	long save(Book book);
	
	//	Get a Single record
	Book get(long id);
	
	//	Get all the record
	List<Book> list();
	
	//	Update the records
	void update(long id, Book book);
	
	//	Delete record
	void delete(long id);
}
