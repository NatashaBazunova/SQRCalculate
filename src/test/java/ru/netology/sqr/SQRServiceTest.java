package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
     void shouldCalcSqr1() {
        SQRService service = new SQRService();

        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

        int count = service.calculateSqr(lowerLimit, upperLimit);

        assertEquals(expected, count);
        System.out.println("Количество квадратов:" + count);
    }

    @Test
    void shouldCalcSqr2() {
        SQRService service = new SQRService();

        int lowerLimit = 100;
        int upperLimit = 121;
        int expected = 2;

        int count = service.calculateSqr(lowerLimit, upperLimit);

        assertEquals(expected, count);
        System.out.println("Количество квадратов:" + count);
    }

    @Test
    void shouldCalcSqr3() {
        SQRService service = new SQRService();

        int lowerLimit = 9700;
        int upperLimit = 9801;
        int expected = 1;

        int count = service.calculateSqr(lowerLimit, upperLimit);

        assertEquals(expected, count);
        System.out.println("Количество квадратов:" + count);
    }

    @Test
    void shouldCalcSqr4() {
        SQRService service = new SQRService();

        int lowerLimit = 540;
        int upperLimit = 1694;
        int expected = 18;

        int count = service.calculateSqr(lowerLimit, upperLimit);

        assertEquals(expected, count);
        System.out.println("Количество квадратов:" + count);
    }
}