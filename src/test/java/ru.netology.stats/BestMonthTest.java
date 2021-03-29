package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestMonthTest {

    @Test
    void findMax() {
        BestMonth service = new BestMonth();



        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 12;

        long actual = service.findMax(values);

        assertEquals(expected, actual);
    }
}