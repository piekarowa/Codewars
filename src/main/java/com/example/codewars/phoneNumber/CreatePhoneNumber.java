package com.example.codewars.phoneNumber;

import java.util.Arrays;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers){

        String arrayString = Arrays.toString(numbers);
        StringBuilder toPhoneNum = new StringBuilder();

        toPhoneNum.append("(")
                .append(arrayString.charAt(0))
                .append(arrayString.charAt(1))
                .append(arrayString.charAt(2))
                .append(")")
                .append(" ")
                .append(arrayString.charAt(3))
                .append(arrayString.charAt(4))
                .append(arrayString.charAt(5))
                .append("-")
                .append(arrayString.charAt(6))
                .append(arrayString.charAt(7))
                .append(arrayString.charAt(8))
                .append(arrayString.charAt(9));

return toPhoneNum.toString();

    }

}
