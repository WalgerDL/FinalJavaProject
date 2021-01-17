package ru.sber.atm;

import ru.sber.processingServer.InvalidFormatCardException;

import java.time.LocalDate;

public interface App {

    String getBalance(String pan, String pin, LocalDate expDate) throws InvalidExpDateException,
            IncorrectPinException, InvalidFormatCardException;
}
