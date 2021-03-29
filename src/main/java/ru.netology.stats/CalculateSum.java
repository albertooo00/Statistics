package ru.netology.stats;

public class CalculateSum {
    public long total (long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
}