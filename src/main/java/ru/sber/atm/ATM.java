package ru.sber.atm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.processingServer.CurrencyData;
import ru.sber.processingServer.InvalidFormatCardException;
import ru.sber.processingServer.ProcessingServer;
import ru.sber.processingServer.SecretData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.function.Predicate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ATM implements App{

        private SecretData secretData=new SecretData();
        private ProcessingServer processingServer=new ProcessingServer();
        private CurrencyData currencyData=new CurrencyData();
        private Currency currency;



    @Override
    public String getBalance (String pan, String pin, LocalDate expDate) throws InvalidExpDateException,
            IncorrectPinException, InvalidFormatCardException {

        verificationOfInputParams();
        getCurrency();
        requestOfBalance();
        return "Баланс карты "+requestOfBalance()+" "+getCurrency();
    }



    public boolean verificationOfInputParams() throws InvalidFormatCardException,
            IncorrectPinException, InvalidExpDateException {

        List<Boolean> verOfInPar = new ArrayList<>();
        verOfInPar.add(vCard());
        verOfInPar.add(vPin());
        verOfInPar.add(vExpDate());
        verOfInPar.add(vExpDateToStr());

        return verOfInPar.stream()
                .allMatch(s ->verOfInPar.contains(true));
    }

    private boolean vPin() throws IncorrectPinException {
        Predicate<Boolean> predicate;
        predicate = this::testPin;
        return  predicate.test(secretData.isVerifyingPin());

    }

    private boolean vCard() throws InvalidFormatCardException {
        Predicate<Boolean> predicate;
        predicate = this::testCard;
        return  predicate.test(secretData.isVerifyingCard());

    }

    private boolean vExpDate () throws InvalidExpDateException {
        Predicate<Boolean> predicate;
        predicate = this::testExpDate;
        return predicate.test(secretData.isVerifyingExpDate());
    }

    private boolean vExpDateToStr () throws InvalidExpDateException {
        Predicate<Boolean> predicate;
        predicate = this::testExpDateToStr;
        return predicate.test(secretData.isVerifyingExpDateToString());
    }

    private Currency getCurrency() {
        CurrencyData currencyData=new CurrencyData();
        return new CurrencyData().valueCurrency(currency);
    }

    private String requestOfBalance(){
        ProcessingServer processingServer=new ProcessingServer();
        return new ProcessingServer().getAmount();
    }


    private boolean testCard(Boolean vCard) {
        try {
            return secretData.isVerifyingCard();
        } catch (InvalidFormatCardException e) {
            e.printStackTrace();
        }
        return vCard;
    }

    private boolean testPin(Boolean vPin) {
        try {
            return secretData.isVerifyingPin();
        } catch (IncorrectPinException e) {
            e.printStackTrace();
        }
        return vPin;
    }
    private boolean testExpDate(Boolean vExpDate) {
        try {
            return secretData.isVerifyingExpDate();
        } catch (InvalidExpDateException e) {
            e.printStackTrace();
        }
        return vExpDate;
    }
    private boolean testExpDateToStr(Boolean vExpDateToStr) {
        try {
            return secretData.isVerifyingExpDateToString();
        } catch (InvalidExpDateException e) {
            e.printStackTrace();
        }
        return vExpDateToStr;
    }
}
