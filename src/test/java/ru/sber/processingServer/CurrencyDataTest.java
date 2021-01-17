package ru.sber.processingServer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CurrencyDataTest {





   AccountsList accountsListMock = Mockito.mock(AccountsList.class);

    @Test

    void valueCurrency() {

        Assert.assertEquals("USD","USD");

    }
}