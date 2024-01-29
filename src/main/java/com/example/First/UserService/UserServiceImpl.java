package com.example.First.UserService;

import com.example.First.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    List<User> list = List.of(
            new User(1311L, "Harsh Sikarwar", "7999018195"),
            new User(1312L,"prince","8426"),
            new User(1313L,"priyanshu","9696151478")
    );

    @Override
    public User getUser(Long userId) {
        return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
