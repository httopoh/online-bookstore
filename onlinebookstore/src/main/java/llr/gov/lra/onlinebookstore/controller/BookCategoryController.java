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
import org.springframework.web.bind.annotation.RestController;
import llr.gov.lra.onlinebookstore.entity.BookCategory;
import llr.gov.lra.onlinebookstore.service.BookCategoryService;

//@RestController
public class BookCategoryController {

	@Autowired
	private BookCategoryService bookCategoryService;
	
	@GetMapping("/api/categories")
	public List<BookCategory> getAllBookCategories(){
		return this.bookCategoryService.getAllBookCategories();
	}
	@GetMapping("/api/categories/{id}")
	public Optional<BookCategory> getBookCategoryById(@PathVariable Long id){
		return this.bookCategoryService.getBookCategoryById(id);
	}
	
	@PostMapping("/api/categories")
	public void addBookCategory(@RequestBody BookCategory book) {
		this.bookCategoryService.addBookCategory(book);
	}
	@PutMapping("/api/categories/{id}")
	public void updateBookCategory(@PathVariable Long id, @RequestBody BookCategory book) {
		this.bookCategoryService.updateBookCategory(id, book);
	}
	
}
