package ru.sber.processingServer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ru.sber.user.UserID;


@Getter
@Setter
public class ProcessingServer {
    ProcessingServer processingServer=new ProcessingServer();
    UserID userID = new UserID();


    String[] clientID=new String[3];






    private String[] CARD0={"4276000011110777", "01/23", "1234"};
    private String[] CARD1={"5469000022220888", "02/22", "9876"};
    private String[] CARD2={"4279000033330999", "05/21", "0102"};
    private String[] CARD3={"2202000044440666", "07/25", "8520"};
    private String[] CARDn={"0000000000000000", "00/00", "0000"};

    private int randomBalance = (int) (Math.random()*150000);



    public ProcessingServer(ProcessingServer processingServer) {
        this.processingServer = processingServer;

    }




        private String[] accountCard=new String[3];


    public ProcessingServer() {

    }
}
