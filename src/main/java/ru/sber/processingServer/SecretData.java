package ru.sber.processingServer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import ru.sber.user.User;

import java.util.HashMap;

@NonNull
@Getter
@AllArgsConstructor
public class SecretData {

    //private User user=new User();
    User user=new User();

    public SecretData() {

    }

    public boolean verifyingCard () throws InvalidFormatCardException {
        boolean formatCard;
        if (user.getPan().matches("^[0-9]{16}$")) {
            formatCard=true;
        } else
            throw new InvalidFormatCardException("Неверный формат номера карты");
        return formatCard;
    }

    public final boolean verifyingPin(){

        HashMap <String,String> secretPin =new  HashMap<>();

        secretPin.put("4276000011110777","1234");
        secretPin.put("5469000022220888","9876");
        secretPin.put("4279000033330999","0102");
        secretPin.put("2202000044440666","8520");
        secretPin.put("0000000000000000","0000");

        boolean extractSecretPin;
       return extractSecretPin=secretPin.containsValue(user.getPin());
    }

    public final boolean verifyingExpDate(){

        HashMap<String,String> secretExpDate=new HashMap<>();
        secretExpDate.put("4276000011110777","01/23");
        secretExpDate.put("5469000022220888","02/22");
        secretExpDate.put("4279000033330999","03/21");
        secretExpDate.put("2202000044440666","12/20");
        secretExpDate.put("0000000000000000","00/00");

        boolean extractSecretExpDate;

        return extractSecretExpDate=secretExpDate.containsValue(user.getExpDate());
    }

}
