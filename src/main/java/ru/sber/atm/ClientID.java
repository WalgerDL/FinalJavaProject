package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;
import ru.sber.processingServer.ProcessingServer;
import ru.sber.user.UserID;

import java.util.HashMap;

@Getter
@Setter
class ClientID {

    ClientID clientID=new ClientID();
    ProcessingServer processingServer=new ProcessingServer();
    UserID userID=new UserID();

    private String inputCard=userID.getNumberCard();
    private String inputPwd=userID.getPwd();

    boolean verification;

    private void Verification() {


        HashMap<String, String> verify = new HashMap<>();
        verify.put(processingServer.getCARD0(), processingServer.getPWD0());
        verify.put(processingServer.getCARD1(), processingServer.getPWD1());
        verify.put(processingServer.getCARD2(), processingServer.getPWD2());
        verify.put(processingServer.getCARD3(), processingServer.getPWD3());
        verify.put(processingServer.getCARDn(), processingServer.getPWDn());

        verification= verify.containsKey(inputCard) && verify.containsValue(inputPwd);
    }
}
