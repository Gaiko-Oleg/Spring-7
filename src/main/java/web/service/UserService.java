package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    User findById(int id);

    void add(User user);

    void update(User user);

    void deleteById(int id);
}
