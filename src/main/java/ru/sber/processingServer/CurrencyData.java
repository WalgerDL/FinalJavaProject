package ru.sber.processingServer;

import lombok.Getter;

import java.util.Currency;

@Getter

public class CurrencyData {
     AccountsList accountsList=new AccountsList();
    Currency currency=ValueCurrency();

    public CurrencyData() {
        this.currency = currency;
    }

    public Currency ValueCurrency (){
        AccountsList accountsList=new AccountsList();
        String rusCodeCurrency=accountsList.getAccCurrency();
        //Currency currency;
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
         else
             try {
                 throw new InvalidCurrencyException("Неподдерживаемая валюта");
                } catch (InvalidCurrencyException e) {
                 e.printStackTrace();
             }

             return currency;

    }





}
