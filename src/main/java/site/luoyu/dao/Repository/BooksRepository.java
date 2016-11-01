package site.luoyu.dao.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import site.luoyu.dao.Books;


import java.util.List;

/**
 * Created by xd on 2016/9/18.
 */
//这里不需要写,继承curd后直接就能用
//@Repository
public interface BooksRepository extends CrudRepository<Books, Long>,PagingAndSortingRepository<Books, Long>{
    List<Books> findByName(String name);
}
