package llr.gov.lra.onlinebookstore.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import llr.gov.lra.onlinebookstore.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
