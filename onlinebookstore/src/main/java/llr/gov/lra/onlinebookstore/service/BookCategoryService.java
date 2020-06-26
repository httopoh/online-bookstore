package llr.gov.lra.onlinebookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import llr.gov.lra.onlinebookstore.entity.BookCategory;
import llr.gov.lra.onlinebookstore.repository.BookCategoryRepository;

//@Service
public class BookCategoryService {

	@Autowired
	private BookCategoryRepository bookCategoryRepository;
	
	public List<BookCategory> getAllBookCategories(){
		return (List<BookCategory>) this.bookCategoryRepository.findAll();
	}
	
	public Optional<BookCategory> getBookCategoryById(Long id) {
		return this.bookCategoryRepository.findById(id);
	}
	
	public void addBookCategory(BookCategory book) {
		this.bookCategoryRepository.save(book);
	}
	
	public void updateBookCategory(Long id, BookCategory book) {
		this.bookCategoryRepository.save(book);
	}
	
	public void deleteBookCategory(Long id) {
		this.bookCategoryRepository.deleteById(id);
	}

}
