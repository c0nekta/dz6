package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int a, int b) {
        int amount = 0;
        for (int i = a; i <= b; i++) {
            if (i * i <= b) {
                amount++;
            }
        }
        return amount;
    }
}


