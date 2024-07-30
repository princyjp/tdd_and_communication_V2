package org.example;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Mean {
//    the mean average is the sum of all the values divided by the number of values.

    public double calculateMean(int[] input) {
        //iterate input
        //int sum +=
        //return mean = sum/input.length
        float sum = 0;
        float mean = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        if(input == null || input.length == 0){
            return 0;
        }
        for (int j : input) {
            sum += j;
        }
        mean = (sum / input.length);
        System.out.println(df.format(mean));

        return Double.valueOf(df.format(mean));
    }
}
