package ru.sber.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.sber.user.properties")
@PropertySource("classpath:user.properties")

public class UserContextConfiguration {

    @Bean
    public User userBean(){
        return new User();
    }



}
