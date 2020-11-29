package ru.sber;


import ru.sber.processingServer.AccountsList;
import ru.sber.processingServer.CurrencyData;

public class Main {


   public static void main(String[] args) {
       CurrencyData currencyData=new CurrencyData();
       AccountsList accountsList=new AccountsList();
       System.out.println(currencyData.getCurrency());

    }
}
