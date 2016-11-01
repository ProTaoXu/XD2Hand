package site.luoyu.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import site.luoyu.dao.BookIsbn;

/**
 * Created by xd on 2016/11/1.
 */
public interface BookIsbnRepository extends CrudRepository<BookIsbn, Long>{
    BookIsbn findByIsbn10(String isbn10);
    BookIsbn findByIsbn13(String isbn13);
}
