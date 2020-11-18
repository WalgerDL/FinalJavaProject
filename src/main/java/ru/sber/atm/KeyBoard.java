package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;
import ru.sber.user.PANofCard;
import ru.sber.user.Password;



@Getter
@Setter
public class KeyBoard {



    //todo: данные из UserID для передачи на TransferData

    KeyBoard keyBoard = new KeyBoard();
    //UserID userID=new UserID();
    PANofCard paNofCard = new PANofCard();
    Password password = new Password();

//    private String enterCard= getUserID().getNumberCard();
//    private String enterPin= getUserID().getPwd();

    public void KeyboardMet() {
        System.out.println("Вставте карту: " + paNofCard.getPanCard() + "\n" + "Введите пин-код: " + password.getPwd());

    }




}
