package com.example.mytubebackend.User.Controller;

import com.example.mytubebackend.User.Domain.User;
import com.example.mytubebackend.User.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/test")
    public String getUser(@RequestBody User user){
//        System.out.println("Email:" + user.getEmail());
        userService.join(user);

        return "user";
    }
}
