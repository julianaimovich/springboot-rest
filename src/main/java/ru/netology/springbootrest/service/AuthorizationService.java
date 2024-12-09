package ru.netology.springbootrest.service;

import ru.netology.springbootrest.constants.Authorities;
import ru.netology.springbootrest.domain.User;
import ru.netology.springbootrest.exception.InvalidCredentials;
import ru.netology.springbootrest.exception.UnauthorizedUser;
import ru.netology.springbootrest.repository.UserRepository;

import java.util.List;

public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User guest) {
        if (isEmpty(guest.getUser()) || isEmpty(guest.getPassword())) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(guest);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + guest.getUser());
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}