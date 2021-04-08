package ru.sber;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.sber.service.AccountsService;

import java.util.Arrays;

@AllArgsConstructor
@Getter
@Setter
@Data
@Log

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Main {

   @Autowired
    private AccountsService accountsService;

    public Main() {}


        public static void main (String[]args){

            ApplicationContext ctx = SpringApplication.run(Main.class, args);

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                log.info(beanName);
            }

        }


    }

