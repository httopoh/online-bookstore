package llr.gov.lra.onlinebookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import llr.gov.lra.onlinebookstore.entity.Book;
import llr.gov.lra.onlinebookstore.repository.BookRepository;

//@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
		return (List<Book>) this.bookRepository.findAll();
	}
	
	public Optional<Book> getBookById(Long id) {
		return this.bookRepository.findById(id);
	}
	
	public void addBook(Book book) {
		this.bookRepository.save(book);
	}
	
	public void updateBook(Long id, Book book) {
		this.bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		this.bookRepository.deleteById(id);
	}
}
