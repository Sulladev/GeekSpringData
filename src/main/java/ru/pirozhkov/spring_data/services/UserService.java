package ru.pirozhkov.spring_data.services;

import ru.pirozhkov.spring_data.entity.User;

import java.util.List;

public interface UserService {

    User get(Integer id);
    List<User> getAll();
    void save(User user);
    void remove(User user);

}
