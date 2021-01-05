package ru.sber;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ru.sber.atm.ATM;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.processingServer.InvalidFormatCardException;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@Data
public class Main {


    public static void main(String[] args)
            throws IncorrectPinException,InvalidExpDateException, InvalidFormatCardException {

        ATM atm = new ATM();

        if (atm.verificationOfInputParams()) {
            System.out.println(atm.getBalance("5469000022220888","9876", LocalDate.of(2022,02,28)));
        }
    }
}
