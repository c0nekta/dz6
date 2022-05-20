package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int a, int b) {
        int amount = 0;
        for (int i = 0; i <= b; i++) {
            if (i * i >= a)
            if (i * i <= b) {
                amount++;
            }
        }
        return amount;
    }
}


