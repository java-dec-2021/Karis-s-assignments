package com.karis.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.karis.books.models.Book;
import com.karis.books.repositories.BookRepository;

@Service
public class BookService {
	//Adding the book repository as a dependency
	private final BookRepository bookRepository;
	
	//dependency injection for the repository (to access the database)
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	//returns all the books 
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	//creates a book 
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	//retrieves a book 
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
		}
	}
	
	//update a book
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> book = bookRepository.findById(id);
		if(book.isPresent()) {
			Book newBook= book.get();
			newBook.setTitle(title);
			newBook.setDescription(desc);
			newBook.setLanguage(lang);
			newBook.setNumberOfPages(numOfPages);
			return bookRepository.save(newBook);
			
		}else {
			return null;
		}
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
}
