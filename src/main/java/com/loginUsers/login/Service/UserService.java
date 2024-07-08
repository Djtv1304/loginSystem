package com.loginUsers.login.Service;

import com.loginUsers.login.Document.User;
import com.loginUsers.login.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    public User login(String usuarioEstudiante) {

        return userRepository.findUserByUsuarioEstudiante(usuarioEstudiante);

    }
}
