package ru.sber.processingServer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.user.User;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashMap;

@NonNull
@Getter
@AllArgsConstructor

public class SecretData {

    AnnotationConfigApplicationContext context=
            new AnnotationConfigApplicationContext(User.class);
    private User user=context.getBean(User.class);

    public SecretData() {

    }


    @NotNull
    public boolean isVerifyingCard() throws InvalidFormatCardException {



        boolean formatCard;

        if (user.getPan().matches("^[0-9]{16}$")) {
            formatCard = true;
        } else
            throw new InvalidFormatCardException("Неверный формат номера карты");
        return formatCard;
    }

    @NotNull
    public boolean isVerifyingPin() throws IncorrectPinException {



        HashMap<String, String> secretPin = new HashMap<>();

        secretPin.put("4276000011110777", "1234");
        secretPin.put("5469000022220888", "9876");
        secretPin.put("4279000033330999", "0102");
        secretPin.put("2202000044440666", "8520");
        secretPin.put("0000000000000000", "0000");

        boolean extractSecretPin;
        extractSecretPin = secretPin.containsValue(user.getPin());

        if (extractSecretPin) {
        } else
            throw new IncorrectPinException("Неверный пин-код карты");
        return extractSecretPin;
    }

        // ниже идет проверка срока действия карты
        // 1-й способ при помощи парсинга в стринг и поиска соответствия в мапе
        // 2-й способ сравнения срока действия с текущей датой
        // какой способ лучше оставить?

    public final boolean isVerifyingExpDateToString() throws InvalidExpDateException {



        HashMap<String, String> secretExpDate = new HashMap<>();
        secretExpDate.put("4276000011110777", "01/23");
        secretExpDate.put("5469000022220888", "02/22");
        secretExpDate.put("4279000033330999", "03/21");
        secretExpDate.put("2202000044440666", "12/20");
        secretExpDate.put("0000000000000000", "00/00");

        boolean extractSecretExpDateToStr;
        extractSecretExpDateToStr = secretExpDate.containsValue(user.ExpDateToString());

         if (extractSecretExpDateToStr) {
         } else
             throw new InvalidExpDateException("Неверный срок действия карты");

        return extractSecretExpDateToStr;
    }

    public final boolean isVerifyingExpDate() throws InvalidExpDateException {






        boolean extractSecretExpDate;
        long expDateToEpoch=user.getExpDate().toEpochDay();
        long nowDateToEpoch=LocalDate.now().toEpochDay();

        extractSecretExpDate=expDateToEpoch>nowDateToEpoch;

        if (extractSecretExpDate) {
        }
        else {
            throw new InvalidExpDateException("Срок действия карты истек");
        }
        return  extractSecretExpDate;
    }
}
