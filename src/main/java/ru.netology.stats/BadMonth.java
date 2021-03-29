package ru.netology.stats;

public class BadMonth {
    public long findMin (int[] values) {
        int month = 0;
        for (int value : values) {
            month = month + 1;
            if(month < value);
            month = value;

        }
        return month;
    }
}