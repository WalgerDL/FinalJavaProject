package ru.sber;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sber.atm.ATM;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.processingServer.InvalidFormatCardException;
import ru.sber.user.UserContextConfiguration;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@Data
@Log
@Slf4j
public class Main {


    public static void main(String[] args)
            throws IncorrectPinException,InvalidExpDateException, InvalidFormatCardException {

        AnnotationConfigApplicationContext annoConfigAppContext=
                new AnnotationConfigApplicationContext(UserContextConfiguration.class);

        ATM atm = new ATM();

        if (atm.verificationOfInputParams()) {
            System.out.println(atm.getBalance("5469000022220888","9876", LocalDate.of(2022,02,28)));
        }
        annoConfigAppContext.close();
    }
}
