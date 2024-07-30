package org.example;

import java.util.Arrays;

public class SumOfMiddleNumbers {

    public int sumOfMiddleNumbers(int[] input) {

        int sum = 0;

        if (input == null || input.length == 0) {
            return 0;
        }

        Arrays.sort(input);

        for (int i = 1; i <= input.length - 2; i++) {
            sum += input[i];
        }
        return sum;
    }
}
