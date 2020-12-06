package ru.sber;


import ru.sber.processingServer.ProcessingServer;

public class Main {


   public static void main(String[] args) {
       ProcessingServer processingServer=new ProcessingServer();
       System.out.println(processingServer.getAmount());
   }
}
