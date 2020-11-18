package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;
import ru.sber.user.PANofCard;
import ru.sber.user.Password;

@Getter
@Setter
public class TransferData {
    //todo:сделать поля для запроса из ClientId для передачи данных из KeyBoard на сервер после верификации (или сделать еще один класс для отправки или получения из/на серевер)

    TransferData transferData=new TransferData();
    ClientID clientID=new ClientID();
    PANofCard paNofCard=new PANofCard();
    Password password=new Password();

    private String verifiedCard;
    private String verifiedPin;

    private void VerifiedData(){
        if (clientID.isVerificationData()==true){
            verifiedCard= paNofCard.getPanCard();
            verifiedPin= password.getPwd();
        }
        else {
            System.out.println("Неправильно введён PIN!");
        }
    }

}
