package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;
import ru.sber.user.PANofCard;
import ru.sber.user.Password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@Setter
public class TransferData {
    //todo:сделать поля для запроса из ClientId для передачи данных из KeyBoard на сервер после верификации (или сделать еще один класс для отправки или получения из/на серевер)

//    TransferData transferData=new TransferData();
//    ClientID clientID=new ClientID();
    PANofCard paNofCard=new PANofCard();
    Password password=new Password();
    //public static Pattern compile (String literal){
      Pattern patternPin = Pattern.compile(password.getPwd());
      Pattern patternCard=Pattern.compile(paNofCard.getPanCard());


    String verifiedPin=password.getPwd();
    boolean matchesPin = verifiedPin.matches(password.getPwd());
    String verifiedCard=paNofCard.getPanCard();
    boolean matchesCard = verifiedCard.matches(paNofCard.getPanCard());

    //    private String verifiedCard;
//    private String verifiedPin;
    private Matcher matcher(CharSequence input) {

        return null;
    }

    private boolean verified;


    public TransferData(boolean verified) {
        this.verified = verified;

    }



}
