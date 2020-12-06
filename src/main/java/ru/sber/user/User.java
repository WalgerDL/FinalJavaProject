package ru.sber.user;

import ru.sber.atm.App;

//@Getter
//@NoArgsConstructor

public class User {

    private String pan="4276000011110777";
    private String pin="1234";
    private String expDate="01/23";

    public User() {

    }

    public String getPan() {
        return pan;
    }

    public String getPin() {
        return pin;
    }

    public String getExpDate() {
        return expDate;
    }

    public User(String pan, String pin, String expDate) {
        this.pan = pan;
        this.pin = pin;
        this.expDate = expDate;
    }

    public String getBalance(App atm){
      return atm.getBalance(pan,pin,expDate);

    }
}
