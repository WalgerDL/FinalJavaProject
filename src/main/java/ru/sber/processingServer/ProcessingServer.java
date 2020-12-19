package ru.sber.processingServer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingServer {


    private String amount= String.format("%.2f",random());


    public BigDecimal random (){

        return BigDecimal.valueOf(Math.random()*150000);
    }

    public static <E> E getValue(BigDecimal amount){
        return (E) BigDecimal.valueOf(Math.random()*150000);
    }

}

