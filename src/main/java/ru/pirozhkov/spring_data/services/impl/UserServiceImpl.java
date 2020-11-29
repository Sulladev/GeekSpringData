package ru.pirozhkov.spring_data.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pirozhkov.spring_data.entity.User;
import ru.pirozhkov.spring_data.repositories.UserRepository;
import ru.pirozhkov.spring_data.services.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public User get(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void remove(User user) {
        userRepository.delete(user);
    }
}
