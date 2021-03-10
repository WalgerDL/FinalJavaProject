package ru.sber.user;


import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.Main;
import ru.sber.atm.ATM;
import ru.sber.entity.Accounts;
import ru.sber.service.AccountsService;
import ru.sber.service.ClientsService;

import java.util.List;

@NoArgsConstructor
@RestController
public class Controller {

    @NonNull AccountsService accountsService;
    @NonNull ClientsService clientsService;

    @RequestMapping("/")
    public String index() {
        Main main=new Main();
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ATM.class);
        ATM atm=context.getBean(ATM.class);

        return atm.getBalanceInScreen();// + " " + Data();



    }
    @RequestMapping("/data")
    public List<Accounts> Data(){
        AccountsService accountsService = new AccountsService();
        User user = new User();

        return accountsService.findById();

//
   }

}
