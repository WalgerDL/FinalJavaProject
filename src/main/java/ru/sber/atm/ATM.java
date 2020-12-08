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

    public ATM() throws InvalidCurrencyException {
    }


    @Override
    public String getBalance (String pan, String pin, String expDate) throws InvalidExpDateException,
            InvalidCardException, IncorrectPinException, InvalidFormatCardException, InvalidCurrencyException {

        verificationInputParams();
        currency();
        requestBalance();



        return "Баланс карты "+requestBalance()+" "+currency();
    }



    public boolean verificationInputParams() throws InvalidFormatCardException, InvalidCardException,
            IncorrectPinException, InvalidExpDateException {

        if (secretData.VerifyingCard()==false) {
            throw new InvalidCardException("Карта недействительна");
        }if (secretData.verifyingPin()==false) {
            throw new IncorrectPinException("Неправильно ввден ПИН");
        }if (secretData.verifyingExpDate()==false) {
            throw new InvalidExpDateException("Неверный срок дкействия карты");
        }else return true;
    }

    private Currency currency() throws InvalidCurrencyException {
        CurrencyData currencyData=new CurrencyData();
        Currency currency;
        return currency=currencyData.valueCurrency();
    }

    private String requestBalance(){
        ProcessingServer processingServer=new ProcessingServer();
        String requestBalance;
        return requestBalance=processingServer.getAmount();
    }


}
