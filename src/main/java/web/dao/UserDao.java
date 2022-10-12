package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void updateUser(int id, User user);

    User getUserAtId(int id);
    void saveUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

}
