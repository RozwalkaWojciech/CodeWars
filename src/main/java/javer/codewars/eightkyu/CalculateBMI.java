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
        double bmiResult = bmiCalculator(weight, height);
        if (bmiResult <= 18.5) {
            return "Underweight";
        } else if (bmiResult <= 25.0) {
            return "Normal";
        } else if (bmiResult <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static String bmi2(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi <= 25.0 ? bmi <= 18.5 ? "Underweight" : "Normal" : bmi <= 30.0 ? "Overweight" : "Obese";
    }

    private static double bmiCalculator(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}
