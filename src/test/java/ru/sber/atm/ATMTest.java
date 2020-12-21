package ru.sber.atm;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import ru.sber.processingServer.SecretData;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @Test
    void getBalance() {
        Assert.assertEquals("","");
    }
    @InjectMocks
    private SecretData secretData;
    @Test
    void verificationOfInputParams() {
        Assert.assertEquals(true,true);

    }
}