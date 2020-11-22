package ru.sber.atm;

import ru.sber.processingServer.ProcessingServer;

public class DisplayData {

    //todo: сделать метод для отображения баланса на экране

   // DisplayData displayData=new DisplayData();
    ProcessingServer processingServer=new ProcessingServer();

    public void GetBalance(){
        //System.out.println("На Вашем счете: " + processingServer.getAccountBalance()+ " руб.");
        if(processingServer.isVerification()==true){
            System.out.println("На Вашем счете: " + processingServer.getRandomBalance()+ " руб.");
        }
        else{
            System.out.println("Неправильно введён ПИН");
        }
    }


}
