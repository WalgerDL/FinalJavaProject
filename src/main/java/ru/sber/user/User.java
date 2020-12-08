package ru.sber.user;

import lombok.Getter;
import lombok.Setter;
import ru.sber.atm.App;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidCardException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.processingServer.InvalidCurrencyException;
import ru.sber.processingServer.InvalidFormatCardException;

@Getter
@Setter
public class User {

    private String pan="5469000022220888";
    private String pin="9876";
    private String expDate="02/22";

    public User() {

    }

    public User(String pan, String pin, String expDate) {
        this.pan = pan;
        this.pin = pin;
        this.expDate = expDate;
    }

    public String getBalance(App atm) throws IncorrectPinException, InvalidCardException, InvalidExpDateException,
            InvalidFormatCardException, InvalidCurrencyException {
        return atm.getBalance(pan,pin,expDate);

    }

}
