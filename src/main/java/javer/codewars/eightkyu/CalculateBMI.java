package javer.codewars.eightkyu;

/*
Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese"
 */

import static java.lang.Math.*;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        var bmiResult = bmiCalculator(weight, height);
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
        var bmi = weight / (height * height);
        return bmi <= 25.0 ? bmi <= 18.5 ? "Underweight" : "Normal" : bmi <= 30.0 ? "Overweight" : "Obese";
    }

    public static String bmi3(double weight, double height) {
        var bmi = weight / (height * height);
        if (bmi <= 18.5) {
            return "Underweight";
        }
        if (bmi <= 25) {
            return "Normal";
        }
        if (bmi <= 30) {
            return "Overweight";
        }
        return "Obese";
    }

    private static double bmiCalculator(double weight, double height) {
        return weight / pow(height, 2);
    }
}
