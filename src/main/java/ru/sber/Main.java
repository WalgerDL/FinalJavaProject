package ru.sber;


import ru.sber.atm.DisplayData;
import ru.sber.atm.KeyBoard;

public class Main {


   public static void main(String[] args) throws StackOverflowError {

        DisplayData displayData1=new DisplayData();
        KeyBoard keyBoard=new KeyBoard();

        keyBoard.KeyboardMet();
        displayData1.GetBalance();



    }
}
