package ru.javamentor.spring_boot.service;

import ru.javamentor.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    List<User> getUsersList();
    User getUser(Long id);
}
