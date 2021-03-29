package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMonthTest {

    @Test
    void average() {
        AverageMonth service = new AverageMonth();

        long[]purchases ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.average(purchases);
        assertEquals(expected, actual);
    }
}