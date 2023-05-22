package com.example.codewars.camelCase;

import static com.example.codewars.camelCase.ToCamelCase.toCamelCase;

public class Main {

    public static void main(String[] args) {
        String input = "hello_world-Example";
        String camelCase = toCamelCase(input);
        System.out.println(camelCase);
    }

}
