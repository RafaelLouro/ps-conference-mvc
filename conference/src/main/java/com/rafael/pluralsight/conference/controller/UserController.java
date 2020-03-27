package com.rafael.pluralsight.conference.controller;

import com.rafael.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Rafael") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Louro") String lastName,
                        @RequestParam(value = "age", defaultValue = "10") int age) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname: " + user.getFirstName());
        return user;
    }
}
