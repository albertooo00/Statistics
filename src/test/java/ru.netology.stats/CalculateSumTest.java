package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSumTest {

    @Test
    void total() {
        CalculateSum service = new CalculateSum();

        long[]sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.total(sales);
        assertEquals(expected, actual);
    }
}