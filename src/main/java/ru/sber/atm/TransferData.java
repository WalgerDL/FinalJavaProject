package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransferData {
    //todo:сделать поля для запроса из ClientId для передачи данных из KeyBoard на сервер после верификации (или сделать еще один класс для отправки или получения из/на серевер)

    TransferData transferData=new TransferData();
    ClientID clientID=new ClientID();
    KeyBoard keyBoard=new KeyBoard();

    FindData findData=new FindData();


}
