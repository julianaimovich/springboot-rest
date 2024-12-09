package ru.netology.springbootrest.repository;

import ru.netology.springbootrest.constants.Authorities;

import java.util.Collections;
import java.util.List;

public class UserRepository {

    public final String adminUser = "admin";
    public final String adminPassword = "adminpasswd1";

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals(adminUser) && password.equals(adminPassword)) {
            return List.of(Authorities.values());
        }
        return Collections.emptyList();
    }
}