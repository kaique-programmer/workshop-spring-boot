package com.workshopspringboot.workshopspringboot.resources;


import com.workshopspringboot.workshopspringboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "kaique", "kaique@gmail.com", "123", "986593625");
        return ResponseEntity.ok().body(user);
    }
}
