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
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import ru.sber.entity.Accounts;
import ru.sber.entity.Clients;
import ru.sber.service.AccountsService;
import ru.sber.user.User;

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
        @EventListener(ApplicationReadyEvent.class)
        private void getAccountsData () {
            Clients clients = new Clients();
            User user = new User();
            clients.setPan(user.getPan());
            Accounts accounts = new Accounts();

//            accounts.setAccount_info(accountsService.findById(1));
//          //  accountsService.findByPan(user.getPan());


//        Users users = new Users();
//        users.setAddress(address);
//        users.setEmail("someEmail@gmail.com");
//        users.setName("Smith");
//        userService.createUsers(users);
//        Users users1 = new Users();
//        users1.setName("Jon Dorian");
//        users1.setEmail("gmailEmail@gmail.com");
//        users1.setAddress(address1);
//        userService.createUsers(users1);
//
//        userService.findAll().forEach(it-> System.out.println(it));
//
//        userService.findAllByName("Smith").forEach(it-> System.out.println(it));
//
//        userService.findWhereEmailIsGmail().forEach(it-> System.out.println(it));
//
//        userService.findWhereNameStartsFromSmith().forEach(it-> System.out.println(it));
        }
//    User user=new User();
//    String accountData=accountsService.findByPan(user.getPan());

    }

