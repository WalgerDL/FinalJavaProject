package ru.sber.processingServer;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class ProcessingServer <T> {


    private String amount= String.format("%.2f",random());

    public ProcessingServer(String amount) {
        this.amount = amount;
    }


    public ProcessingServer() {

    }

    public BigDecimal random (){

        return BigDecimal.valueOf(Math.random()*150000);
    }

    public static <E> E getValue(BigDecimal amount){
        return (E) BigDecimal.valueOf(Math.random()*150000);
    }

}

