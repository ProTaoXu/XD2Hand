package site.luoyu.dao;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Created by xd on 2016/9/18.
 */
//这里不需要写,继承curd后直接就能用
//@Component
public interface BooksRepository extends CrudRepository<Books, Long> {
    List<Books> findByName(String name);
}
