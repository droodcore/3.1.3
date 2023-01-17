package ru.kata.spring.boot_security.demo.service;



import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User show(int id);
    public void save(User user);
    public void update(int id, User updatedUser);
    public void delete(int id);
}
