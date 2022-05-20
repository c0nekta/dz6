package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int limit) {
        int count = 0;
        for (int i = 0; i < 99; i++) {
            if (i * i <= limit) {
                count++;
            }
        }
        return count;
    }
}


