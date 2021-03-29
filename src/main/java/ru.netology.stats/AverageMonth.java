package ru.netology.stats;

public class AverageMonth {
    public long average (long[] purchases) {
        long sum = 0;
        long month = 12;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum/month;
    }
}