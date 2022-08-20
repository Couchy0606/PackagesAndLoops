package ru.netology.sqr.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javaqamvn.services.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqrQuantity( 200, 300);

        Assertions.assertEquals(expected, actual);
    }
}