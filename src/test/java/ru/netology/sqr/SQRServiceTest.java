package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSquaresInTheRange() {
        SQRService service = new SQRService();
        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

        int actual = service.sqrtCell(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresBeyondRange() {
        SQRService service = new SQRService();
        int lowerLimit = 10;
        int upperLimit = 90;
        int expected = 0;

        int actual = service.sqrtCell(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresLowerLimitInRange() {
        SQRService service = new SQRService();
        int lowerLimit = 50;
        int upperLimit = 110;
        int expected = 1;

        int actual = service.sqrtCell(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresUpperLimitInRange() {
        SQRService service = new SQRService();
        int lowerLimit = 9700;
        int upperLimit = 9900;
        int expected = 1;

        int actual = service.sqrtCell(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquaresAllInRange() {
        SQRService service = new SQRService();
        int lowerLimit = 1;
        int upperLimit = 10000;
        int expected = 90;

        int actual = service.sqrtCell(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}