package ru.javamentor.spring_boot.dao;


import ru.javamentor.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    List<User> getUsersList();
    User getUser(Long id);

}
