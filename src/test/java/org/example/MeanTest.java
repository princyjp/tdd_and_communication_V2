package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanTest {

    @Test
    @DisplayName("Test to calculate mean of integers and return float")
    void calculateMean() {
        Mean mean = new Mean();
        int[] nullNumber = null;
        int[] emptyArray = {};
        int[] zeroNumber = {0};
        int[] oneNumber = {1};
        int[] twoNumber = {1,2};
        int[] threeNumber = {4,1,5};
        int[] fourNumber = {4,1,5,12};


        var resultForNullNumber = mean.calculateMean(nullNumber);
        var resultForEmptyArray = mean.calculateMean(emptyArray);
        var resultForOneNumber = mean.calculateMean(oneNumber);
        var resultForTwoNumber = mean.calculateMean(twoNumber);
        var resultForThreeNumber = mean.calculateMean(threeNumber);
        var resultForFourNumber = mean.calculateMean(fourNumber);
        var resultForZeroNumber = mean.calculateMean(zeroNumber);

        assertAll(
                () -> assertEquals(0, resultForNullNumber),
                () -> assertEquals(0, resultForEmptyArray),
                () -> assertEquals(1,resultForOneNumber),
                () -> assertEquals(1.5,resultForTwoNumber),
                () -> assertEquals(3.33, resultForThreeNumber),
                () -> assertEquals(5.5, resultForFourNumber),
                () -> assertEquals(0, resultForZeroNumber)
        );
    }
}