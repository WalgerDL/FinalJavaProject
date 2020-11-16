package ru.sber.processingServer;

import lombok.Getter;
import lombok.Setter;
import ru.sber.user.UserID;

import java.util.HashMap;


@Getter
@Setter
public class ProcessingServer {      //Типа процесснговый сервер
    ProcessingServer processingServer=new ProcessingServer();
    UserID userID = new UserID();

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

    private int randomBalance = (int) (Math.random()*150000);

    private int accountBalance;

    private String inputCard=userID.getNumberCard();
    private String inputExp=userID.getDate();
    private String inputPwd=userID.getPwd();

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
    private void AccountBalance() {

        HashMap<String,Integer> findBalance= new HashMap<String, Integer>();
        findBalance.put(CARD0,randomBalance);
        findBalance.put(CARD1,randomBalance);
        findBalance.put(CARD2,randomBalance);
        findBalance.put(CARD3,randomBalance);
        findBalance.put(CARDn,randomBalance);

        accountBalance=findBalance.get(inputCard);

  //  return accountBalance;
}


    public ProcessingServer(ProcessingServer processingServer) {
            this.processingServer = processingServer;

        }



    public ProcessingServer() {

    }
}
