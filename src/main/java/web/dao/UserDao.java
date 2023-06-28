package web.dao;

import web.models.User;
import java.util.List;

public interface UserDao {
    List<User> listUsers();

    User findById(int id);

    void add(User user);

    void deleteById(int id);

    void update(User user);


}
