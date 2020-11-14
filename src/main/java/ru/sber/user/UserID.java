package ru.sber.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class UserID {

        UserID userID = new UserID();
        PANofCard paNofCard = new PANofCard();
        ExpDate expDate=new ExpDate();
        Password password=new Password();

        private String numberCard= paNofCard.getPanCard();
        private String date=expDate.getExpDate();
        private String pwd=password.getPwd();

        private String [] cardData= {getNumberCard(),getDate(),getPwd()};









}
