package ru.sber.processingServer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.sber.user.User;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
public class AccountsList {

    User user = new User();

    public String getAccCurrency() {
        return accCurrency;
    }

    public AccountsList(String accCurrency) {
        this.accCurrency = accCurrency;
    }

    public AccountsList() {

    }


     private String accCurrency=AccountCurrencyCode();

    public String AccountCurrencyCode() {
        HashMap<String, String> CardConfirmAccount = new HashMap<>();

        CardConfirmAccount.put("4276000011110777", "40817810123456789810");
        CardConfirmAccount.put("5469000022220888", "40817840123456789840");
        CardConfirmAccount.put("4279000033330999", "40817978123456789978");
        CardConfirmAccount.put("2202000044440666", "40817810123456789012");
        CardConfirmAccount.put("0000000000000000", "00000000000000000000");
        String key=user.getPan();

        String accCurrency = CardConfirmAccount.get(key);

        return accCurrency.substring(5, 8);
    }


}