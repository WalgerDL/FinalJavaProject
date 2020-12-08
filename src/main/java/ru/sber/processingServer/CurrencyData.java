package ru.sber.processingServer;

import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Getter
@Setter

public class CurrencyData {
     AccountsList accountsList=new AccountsList();
    Currency currency=valueCurrency();

    public CurrencyData(AccountsList accountsList, Currency currency) throws InvalidCurrencyException {
        this.accountsList = accountsList;
        this.currency = currency;
    }

    public AccountsList getAccountsList() {
        return accountsList;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CurrencyData() throws InvalidCurrencyException {
        this.currency = currency;
    }

    public Currency valueCurrency () throws InvalidCurrencyException {
        AccountsList accountsList=new AccountsList();
        String rusCodeCurrency=accountsList.getAccCurrency();

        Currency currency = null;
        if (rusCodeCurrency.equals("810")) {
            currency = Currency.getInstance("RUB");
        }
        if (rusCodeCurrency.equals("840")) {
            currency = Currency.getInstance("USD");
        }
        if (rusCodeCurrency.equals("978")) {
            currency = Currency.getInstance("EUR");
        }

            return currency;

    }

}
