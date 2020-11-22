package ru.sber.processingServer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.sber.atm.ClientID;
import ru.sber.user.PANofCard;
import ru.sber.user.Password;


@Getter
@Setter
@AllArgsConstructor
public class ProcessingServer {//Типа процесснговый сервер




    PANofCard paNofCard=new PANofCard();
    Password password=new Password();
    ClientID clientID=new ClientID();

    private final String CARD0="4276000011110777";
    private final String CARD1="5469000022220888";
    private final String CARD2="4279000033330999";
    private final String CARD3="2202000044440666";
    private final String CARDn="0000000000000000";

    private final String PWD0="1234";
    private final String PWD1="9876";
    private final String PWD2="0102";
    private final String PWD3="8520";
    private final String PWDn="0000";

    String verifiedPin=password.getPwd();
    boolean matchesPin = verifiedPin.matches(PWD0);
    String verifiedCard=paNofCard.getPanCard();
    boolean matchesCard = verifiedCard.matches(CARD0);

    //private static int balance;
    private  boolean verification=matchesCard&matchesPin;



    private int randomBalance = (int) (Math.random()*150000);

//    private int accountBalance;
//
//        private void AccountBalance(){
//
//        if (matchesPin&matchesCard == true) {
//            accountBalance = (int) (Math.random()*150000);
//        }
//        else {
//            accountBalance=0;
//        }
//
//            //return accountBalance;
//        }
//
//

//    }
//
//    public ProcessingServer(int accountBalance) {
//        this.accountBalance = accountBalance;
//        if (verificationData==true) {
//            accountBalance= randomBalance;
//        } else {
//            accountBalance=0;//System.out.println("Неправильно введен ПИН!");
//        }
//    }

   // private boolean verificationData;


//    private void Verification(){
//        if ((paNofCard.getPanCard().equals(CARD0))&&(password.getPwd()==PWD0)) {
//            verificationData = true;
//
//        } else {
//            verificationData = false;
//        }
//
//        //return verifiiedData; //todo: сделать корректный метод по верификации пин-кода
//
//    }

    public ProcessingServer() {

    }


//    public void setAccountBalance( accountBalance) {
//        this.accountBalance = accountBalance;
//    }


    //ProcessingServer processingServer=new ProcessingServer();
    //TransferData transferData=new TransferData();


//    private String inputCard=userID.getNumberCard();
//    private String inputExp=userID.getDate();
//    private String inputPwd=userID.getPwd();

   // private String verifiedInputCard=transferData.getVerifiedCard();

//    private boolean Verification(boolean verification){
//    HashMap <String, String> verify= new HashMap<>();
//    verify.put(CARD0,PWD0);
//    verify.put(CARD1,PWD1);
//    verify.put(CARD2,PWD2);
//    verify.put(CARD3,PWD3);
//    verify.put(CARDn,PWDn);
//
//    if (verify.containsKey(inputCard) && verify.containsValue(inputPwd)){
//        return true;
//        }
//    else {
//        return false;
//        }
//    }

//    private int AccountBalance(int accountBalance){
//        if(Verification(true)){
//            accountBalance=randomBalance;
//            return accountBalance;
//        }
//
//
//        return accountBalance;
//    }




//    private int AccountBalance() {
//        int randomBalance = (int) (Math.random()*150000);
//             if (verificationData==true) {
//                 accountBalance= randomBalance;
//             } else {
//                 accountBalance=0;//System.out.println("Неправильно введен ПИН!");
//             }




//        HashMap<String,Integer> findBalance= new HashMap<String, Integer>();
//        findBalance.put(CARD0,randomBalance);
//        findBalance.put(CARD1,randomBalance);
//        findBalance.put(CARD2,randomBalance);
//        findBalance.put(CARD3,randomBalance);
//        findBalance.put(CARDn,randomBalance);
//
//        accountBalance=findBalance.get(verifiedInputCard);
        //todo:убрать inputCard. Сделать запрос из TransferData, после того, как будет сделано поле

        // return randomBalance;//accountBalance;
}


//    public ProcessingServer(ProcessingServer processingServer) {
//            this.processingServer = processingServer;
//
//        }



//    public ProcessingServer() {
//
//    }

