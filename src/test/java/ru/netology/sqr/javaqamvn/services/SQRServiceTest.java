package ru.netology.sqr.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test
import ru.netology.sqr.javaqamvn.services.SQRService;
//import ru.netology.sqr.javaqamvn.services.SQRService;

public class SQRServiceTest {

    @Test

    public void testRegisteredUnderLimit() {
        SQRService service = new SQRService();

        int expected = 150;
        int actual = service.calcBonus( amount: 5_000, isRegistered: true);
        //System.out.println(expected);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredUnderLimit() {
        SQRService service = new SQRService();

        int expected = 50;
        int actual = service.calcBonus( amount: 5_000, isRegistered: false);
        //System.out.println(expected);

        Assertions.assertEquals(expected, actual);
    }
}
