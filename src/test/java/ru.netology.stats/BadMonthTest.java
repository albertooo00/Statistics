package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadMonthTest {

    @Test
    void findMin() {
        BadMonth service = new BadMonth();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 12;

        long actual = service.findMin(values);

        assertEquals(expected, actual);
    }
}