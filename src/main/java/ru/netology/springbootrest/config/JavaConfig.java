package ru.netology.springbootrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootrest.controller.AuthorizationController;
import ru.netology.springbootrest.repository.UserRepository;
import ru.netology.springbootrest.service.AuthorizationService;

@Configuration
public class JavaConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }

    @Bean
    public AuthorizationController authorizationController(AuthorizationService authorizationService) {
        return new AuthorizationController(authorizationService);
    }
}