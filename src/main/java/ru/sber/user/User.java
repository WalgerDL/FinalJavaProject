package ru.sber.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sber.atm.App;
import ru.sber.atm.IncorrectPinException;
import ru.sber.atm.InvalidExpDateException;
import ru.sber.processingServer.InvalidFormatCardException;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class User {
    @NotNull
    private String pan="5469000022220888";
    private String pin="9876";
    private LocalDate expDate=LocalDate.of(2022,02,28);


    @NotNull
    public String ExpDateToString () {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String date = formatter.format(expDate);
        String strExpDate=date.substring(3,7)+date.substring(9,10);

       return strExpDate;
    }

    public String getBalance(App atm) throws IncorrectPinException,InvalidExpDateException,
            InvalidFormatCardException {
        return atm.getBalance(pan,pin,expDate);

    }

}
