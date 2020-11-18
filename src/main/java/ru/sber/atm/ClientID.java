package ru.sber.atm;

import lombok.Getter;
import lombok.Setter;
import ru.sber.processingServer.ProcessingServer;
import ru.sber.user.PANofCard;
import ru.sber.user.Password;


import java.util.HashMap;

@Getter
@Setter
public class ClientID {


    ClientID clientID=new ClientID();
    ProcessingServer processingServer=new ProcessingServer();
    PANofCard paNofCard=new PANofCard();
    Password password=new Password();

    private String inputCard=paNofCard.getPanCard();
    private String inputPwd=password.getPwd();

    private boolean verificationData;

    private void Verification() {

        HashMap<String, String> verify = new HashMap<>();
        verify.put(processingServer.getCARD0(), processingServer.getPWD0());
        verify.put(processingServer.getCARD1(), processingServer.getPWD1());
        verify.put(processingServer.getCARD2(), processingServer.getPWD2());
        verify.put(processingServer.getCARD3(), processingServer.getPWD3());
        verify.put(processingServer.getCARDn(), processingServer.getPWDn());

        verificationData= verify.containsKey(inputCard) && verify.containsValue(inputPwd);
    }
}
