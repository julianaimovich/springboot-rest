package ru.netology.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.springbootrest.config.JavaConfig;

@SpringBootApplication
public class SpringbootRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApplication.class, args);
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    }
}