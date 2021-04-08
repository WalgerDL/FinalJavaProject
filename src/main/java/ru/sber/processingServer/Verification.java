package ru.sber.processingServer;

import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidExpDateException;

public interface Verification {

    boolean isVerifyingCard() throws InvalidFormatCardException;

    boolean isVerifyingPin() throws IncorrectPinException;

    boolean isVerifyingExpDateToString() throws InvalidExpDateException;

    boolean isVerifyingExpDate() throws InvalidExpDateException;

}
