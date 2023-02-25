package com.jefferson.api.controllers;

import com.jefferson.api.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public ArrayList<User> Users() {
        User user01 = new User("jefferson", "jefferoidtex7@gmail.com", "password123");
        User user02 = new User("maria", "maria123@gmail.com", "password456");
        User user03 = new User("john", "john_doe@yahoo.com", "password789");
        User user04 = new User("sarah", "sarah_lee@hotmail.com", "passwordabc");

        ArrayList<User> users = new ArrayList<>();
        users.add(user01);
        users.add(user02);
        users.add(user03);
        users.add(user04);

        return users;
    }
}
