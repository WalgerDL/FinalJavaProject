package ru.sber.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.sber.atm.App;

@Getter
@NoArgsConstructor
public class User {

    private String pan;
    private String pin;
    private String expDate;

    public User(String pan, String pin, String expDate) {
        this.pan = pan;
        this.pin = pin;
        this.expDate = expDate;
    }

    public String getBalance(App atm){
      return atm.getBalance(pan,pin,expDate);

    }
}
