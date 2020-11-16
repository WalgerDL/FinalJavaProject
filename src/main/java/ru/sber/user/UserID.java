package ru.sber.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserID {



        UserID userID = new UserID();
        PANofCard paNofCard = new PANofCard();
        ExpDate expDate=new ExpDate();
        Password password=new Password();

        private String numberCard= paNofCard.getPanCard();
        private String date=expDate.getExpDate();
        private String pwd=password.getPwd();




//
//         String[] getCardData() {
//                return cardData;
//        }
//
//        private String [] cardData= {getNumberCard(),getDate(),getPwd()};

        public UserID (){

        }










}
