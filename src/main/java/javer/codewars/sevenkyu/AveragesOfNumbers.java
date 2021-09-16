package javer.codewars.sevenkyu;

public class AveragesOfNumbers {

    public static double[] averages(int[] numbers) {
        double[] arr = new double[numbers.length - 1];
        for (var i = 0; i < arr.length; i++) {
            arr[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        return arr;
    }
}
