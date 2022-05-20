package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int a, int b) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (i * i <= b) {
                count++;
            }
        }
        return count;
    }
}


