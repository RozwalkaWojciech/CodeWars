package javer.codewars.sevenkyu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AveragesOfNumbers {
    public static double[] averages(int[] numbers) {

        if(numbers.length < 2){
            return new double[0];
        }

        double[] arr = new double[numbers.length-1];

        for(int i=0; i < arr.length; i++){
                arr[i] = (numbers[i]+numbers[i+1])/2.0;
        }
        return arr;
    }
}
