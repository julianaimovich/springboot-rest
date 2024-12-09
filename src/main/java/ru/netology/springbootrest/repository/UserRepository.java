package ru.netology.springbootrest.repository;

import ru.netology.springbootrest.constants.Authorities;
import ru.netology.springbootrest.domain.User;

import java.util.Collections;
import java.util.List;

public class UserRepository {

    private final User admin = new User("admin", "adminpasswd1");

    public List<Authorities> getUserAuthorities(User user) {
        if (user.equals(admin)) {
            return List.of(Authorities.values());
        }
        return Collections.emptyList();
    }
}