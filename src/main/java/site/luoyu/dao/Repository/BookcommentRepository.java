package site.luoyu.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import site.luoyu.dao.BookComment;

/**
 * Created by xd on 2016/9/18.
 */
public interface BookcommentRepository extends CrudRepository<BookComment,Long> {
}
