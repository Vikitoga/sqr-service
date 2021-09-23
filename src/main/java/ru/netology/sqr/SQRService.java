package ru.netology.sqr;

public class SQRService {
    public int numberOfSqr(int lowerLimit, int upperLimit) {
        int count = 0;
        int sqr;
        for (int i = 10; i <= 99; i++) {
            sqr = i * i;
            if (sqr >= lowerLimit && sqr <=upperLimit) {
                count++;
            }
        }
    return count;
    }
}
