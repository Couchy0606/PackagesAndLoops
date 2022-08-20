package ru.netology.sqr.javaqamvn.services;

public class SQRService {
    int i;
    public int sqrQuantity(int a, int b) {

        int sum = 0;
        for (int i = 10; i < 99; i++) {
            int pow = (int) Math.pow(i, 2);
            if (pow > a && pow < b) {
                sum = sum +1;
            }
        }
        return sum;
    }
}
