package llr.gov.lra.onlinebookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import llr.gov.lra.onlinebookstore.entity.BookCategory;

@Repository
public interface BookCategoryRepository extends CrudRepository<BookCategory, Long> {

}
