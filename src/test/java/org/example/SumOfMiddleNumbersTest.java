package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfMiddleNumbersTest {
    SumOfMiddleNumbers middleNumbers;

    @BeforeEach
    void setUp() {
        middleNumbers = new SumOfMiddleNumbers();
    }

    @Test
    @DisplayName("Test for sum of middle numbers in an array")
    public void sumOfMiddleNumbers() {
        int[] nullNumber = null;
        int[] emptyArray = {};
        int[] oneNumber = {1};
        int[] twoNumber = {1,2};
        int[] threeNumber = {4,1,5};
        int[] fourNumber = {4,1,5,12};
        int[] repeatedNumber = {4,1,1,5,12};

        var resultForNullNumber = middleNumbers.sumOfMiddleNumbers(nullNumber);
        var resultForEmptyArray = middleNumbers.sumOfMiddleNumbers(emptyArray);
        var resultForOneNumber = middleNumbers.sumOfMiddleNumbers(oneNumber);
        var resultForTwoNumber = middleNumbers.sumOfMiddleNumbers(twoNumber);
        var resultForThreeNumber = middleNumbers.sumOfMiddleNumbers(threeNumber);
        var resultForFourNumber = middleNumbers.sumOfMiddleNumbers(fourNumber);
        var resultForRepeatedNumber = middleNumbers.sumOfMiddleNumbers(repeatedNumber);

        assertAll(
                () -> assertEquals(0, resultForNullNumber),
                () -> assertEquals(0, resultForEmptyArray),
                () -> assertEquals(0, resultForOneNumber),
                () -> assertEquals(0, resultForTwoNumber),
                () -> assertEquals(4, resultForThreeNumber),
                () -> assertEquals(9, resultForFourNumber),
                () -> assertEquals(10, resultForRepeatedNumber)
        );
    }
}