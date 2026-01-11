package com.ngovantai.example0001.service;

import com.ngovantai.example0001.dto.UserDto;
import com.ngovantai.example0001.entity.User;

import java.util.List;

public interface UserService {
    User createUser(UserDto dto);

    List<User> getAllUsers();

    User getUserById(Long id);
}
