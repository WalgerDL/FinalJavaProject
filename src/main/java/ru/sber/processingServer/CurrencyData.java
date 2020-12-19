package ru.sber.processingServer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Currency;

@Getter
@Setter
@NoArgsConstructor

public class CurrencyData <T extends AccountsList>{

    T accountsList= (T) new AccountsList<T>();

    public CurrencyData(T accountsList){
        this.accountsList = accountsList;
    }


    public Currency valueCurrency(Currency currency) {
        T accountsList= (T) new AccountsList<T>();

        String rusCodeCurrency=accountsList.accountCurrencyCode();

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
