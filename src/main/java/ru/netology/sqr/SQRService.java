package ru.netology.sqr;

public class SQRService {
    public int sqrtCell(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                counter++;
            }
        }
        return counter;
    }
}
