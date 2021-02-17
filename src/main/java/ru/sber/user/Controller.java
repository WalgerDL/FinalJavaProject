package ru.sber.user;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.atm.ATM;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ATM.class);
        ATM atm=context.getBean(ATM.class);

        return atm.getBalanceInScreen();
    }

}
