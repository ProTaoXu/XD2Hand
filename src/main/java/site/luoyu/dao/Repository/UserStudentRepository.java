package site.luoyu.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import site.luoyu.dao.UserStudent;

import java.util.List;

/**
 * Created by xd on 2016/9/18.
 */
public interface UserStudentRepository extends CrudRepository<UserStudent,Long>{
    List<UserStudent> findByName(String name);
    UserStudent findByStuId(int StuId);
}
