package ru.sber;


import ru.sber.atm.ATM;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidCardException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.processingServer.InvalidCurrencyException;
import ru.sber.processingServer.InvalidFormatCardException;

public class Main {


    public static void main(String[] args)
            throws IncorrectPinException, InvalidCardException, InvalidExpDateException, InvalidFormatCardException, InvalidCurrencyException {

        ATM atm = new ATM();
        if (atm.verificationInputParams()) {
            System.out.println(atm.getBalance("5469000022220888","9876","02/22"));
        }
    }
}
