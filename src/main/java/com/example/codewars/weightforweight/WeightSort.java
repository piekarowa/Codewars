package com.example.codewars.weightforweight;

public class WeightSort {

    public static String orderWeight(String strng) {


        String[] numbers = strng.split("\\s+");

        String summedNumbers = "";

        for (int i = 0; i < numbers.length; i++) {

            int number = Integer.parseInt(numbers[i]);
            int sum = 0;

            while (number != 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }

            summedNumbers += sum;

            if (i < numbers.length - 1) {
                summedNumbers += ", ";
            }

        }


        return summedNumbers;

    }
}


