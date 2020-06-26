package llr.gov.lra.onlinebookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import llr.gov.lra.onlinebookstore.entity.Book;
import llr.gov.lra.onlinebookstore.service.BookService;

//@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/api/books")
	public List<Book> getAllBooks(){
		return this.bookService.getAllBooks();
	}
	@GetMapping("/api/books/{id}")
	public Optional<Book> getBookById(@PathVariable Long id){
		return this.bookService.getBookById(id);
	}
	
	@PostMapping("/api/books")
	public void addBook(@RequestBody Book book) {
		this.bookService.addBook(book);
	}
	@PutMapping("/api/books/{id}")
	public void updateBook(@PathVariable Long id, @RequestBody Book book) {
		this.bookService.updateBook(id, book);
	}
	

}
