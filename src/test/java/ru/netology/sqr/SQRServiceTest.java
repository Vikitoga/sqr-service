package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value={
                    "squaresFrom200To300, 200, 300, 3",
                    "squaresFrom400To800, 400, 800, 9"
            })
    public void shouldNumberOfSqrFromRange(String testname, int lowerLimit, int upperLimit, int expected) {
        SQRService sqr = new SQRService();
        int actual = sqr.numberOfSqr(lowerLimit, upperLimit);
        assertEquals(expected,actual);
    }
}