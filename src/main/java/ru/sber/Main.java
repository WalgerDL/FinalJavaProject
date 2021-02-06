package ru.sber;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sber.atm.ATM;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.processingServer.InvalidFormatCardException;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@Data
@Log

public class Main {


    public static void main(String[] args)
            throws IncorrectPinException,InvalidExpDateException, InvalidFormatCardException {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ATM.class);
        ATM atm=context.getBean(ATM.class);

       // Integer

        if (atm.verificationOfInputParams()) {

           log.info(String.format(atm.getBalance("5469000022220888","9876", LocalDate.of(2022,02,28))));

        }

    }
}
