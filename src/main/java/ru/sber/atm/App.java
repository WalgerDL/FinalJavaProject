package ru.sber.atm;

import ru.sber.processingServer.InvalidFormatCardException;

public interface App {

    String getBalance(String pan, String pin, String expDate) throws InvalidExpDateException, InvalidCardException, IncorrectPinException, InvalidFormatCardException;
}
