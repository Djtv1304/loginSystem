package com.loginUsers.login.Controller;

import com.loginUsers.login.Document.User;
import com.loginUsers.login.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;

    }

    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, String> body) {

        User usuario = userService.login(body.get("usuarioEstudiante"));

        if (usuario != null) {
            return usuario.getPasswordEstudiante().equals(body.get("passwordEstudiante"));
        } else {
            return false;
        }

    }

}
