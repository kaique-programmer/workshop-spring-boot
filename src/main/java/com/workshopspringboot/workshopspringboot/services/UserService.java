package com.workshopspringboot.workshopspringboot.services;

import com.workshopspringboot.workshopspringboot.entities.User;
import com.workshopspringboot.workshopspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }
}
