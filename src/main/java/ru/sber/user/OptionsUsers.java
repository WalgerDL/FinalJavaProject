package ru.sber.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public enum OptionsUsers {
    USER1("4276000011110777","1234","01/23"),
    USER2("5469000022220888","9876","02/22"),
    USER3("4279000033330999","0102","03/21"),
    USER4("2202000044440666","8520","12/20"),
    USERn("0000000000000000","0000","00/00");
    private String panOption;
    private String pinOption;
    private String expDateOption;


    OptionsUsers(String panOption, String pinOption, String expDateOption) {
        this.panOption = panOption;
        this.pinOption = pinOption;
        this.expDateOption = expDateOption;
    }
}
