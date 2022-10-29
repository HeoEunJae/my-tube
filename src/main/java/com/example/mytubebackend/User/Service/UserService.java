package com.example.mytubebackend.User.Service;

import com.example.mytubebackend.User.Dao.UserRepository;
import com.example.mytubebackend.User.Domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void join(User user) {
        userRepository.save(user);
    }
}
