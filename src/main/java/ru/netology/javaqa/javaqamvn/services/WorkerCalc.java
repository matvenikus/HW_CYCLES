package ru.netology.javaqa.javaqamvn.services;

public class WorkerCalc {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money < threshold) {
                if (month >= 1) {
                    money = money + income;
                    money = money - expenses;
                }
            } else {
                count++;
                money = money - expenses;
                money = money / 3;
            }
        }
        return count;
    }
}