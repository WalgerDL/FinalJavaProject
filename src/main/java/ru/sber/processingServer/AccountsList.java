package ru.sber.processingServer;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountsList {
    /* создание неизменяемой мапы для привязки карт к счетам
    (для определения типа валюты по коду классификатора валют */

    public static void createImmutableMap() {
        ImmutableMap<String, String> CardConfirmAccount = ImmutableMap.of();

        CardConfirmAccount.put("card", "account");
        CardConfirmAccount.put("card", "account");
        CardConfirmAccount.put("card", "account");
        CardConfirmAccount.put("card", "account");
        CardConfirmAccount.put("card", "account");


    }
}