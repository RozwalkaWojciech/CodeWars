package javer.codewars.eightkyu;

/*
Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese"
 */

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        if (bmiCalculator(weight, height) <= 18.5) {
            return "Underweight";
        } else if (bmiCalculator(weight, height) <= 25.0) {
            return "Normal";
        } else if (bmiCalculator(weight, height) <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    private static double bmiCalculator(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}
