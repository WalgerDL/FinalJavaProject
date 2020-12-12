package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;
import ru.sber.processingServer.*;

import java.util.Currency;

@Getter
@Setter
public class ATM implements App{

        SecretData secretData=new SecretData();
        ProcessingServer processingServer=new ProcessingServer();
        CurrencyData currencyData=new CurrencyData();
    private Currency currency;

    public ATM() {
    }


    @Override
    public String getBalance (String pan, String pin, String expDate) throws InvalidExpDateException,
            InvalidCardException, IncorrectPinException, InvalidFormatCardException {

        verificationInputParams();
        currency();
        requestBalance();



        return "Баланс карты "+requestBalance()+" "+currency();
    }



    public boolean verificationInputParams() throws InvalidFormatCardException, InvalidCardException,
            IncorrectPinException, InvalidExpDateException {

        if (!secretData.verifyingCard()) {
            throw new InvalidCardException("Карта недействительна");
        }if (!secretData.verifyingPin()) {
            throw new IncorrectPinException("Неправильно ввден ПИН");
        }if (!secretData.verifyingExpDate()) {
            throw new InvalidExpDateException("Неверный срок дкействия карты");
        }else return true;
    }

    private Currency currency() {
        CurrencyData currencyData=new CurrencyData();
        return new CurrencyData().valueCurrency(currency);
    }

    private String requestBalance(){
        ProcessingServer processingServer=new ProcessingServer();
        return new ProcessingServer().getAmount();
    }


}
