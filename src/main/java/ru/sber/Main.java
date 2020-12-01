package ru.sber;


import ru.sber.processingServer.CurrencyData;
import ru.sber.processingServer.SecretData;
import ru.sber.user.User;

public class Main {


   public static void main(String[] args) {
       User user=new User();
       SecretData secretData=new SecretData();
       CurrencyData currencyData=new CurrencyData();

       System.out.println(currencyData.ValueCurrency());
   }
}
