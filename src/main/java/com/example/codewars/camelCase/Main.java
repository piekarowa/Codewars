package com.example.codewars.camelCase;

import static com.example.codewars.camelCase.ToCamelCase.toCamelCase;
import static com.example.codewars.phoneNumber.CreatePhoneNumber.createPhoneNumber;

public class Main {

    public static void main(String[] args) {
        String input = "hello_world-Example";
        String camelCase = toCamelCase(input);
        System.out.println(camelCase);

        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phone = createPhoneNumber(input1);
        System.out.println(phone);
    }


    }


