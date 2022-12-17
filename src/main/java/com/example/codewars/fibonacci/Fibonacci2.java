package com.example.codewars.fibonacci;

public class Fibonacci2 {

    public static void main(String[] args) {
        System.out.println(getFibNumb(6));
    }
    public static int getFibNumb(int n) {

        if(n <= 1){
            return n;
        }

        int number = (getFibNumb(n - 1) + getFibNumb(n - 2));

        String word = String.valueOf(number);

        char lastNumber = word.charAt(word.length() - 1);

        Integer lastNumberInt = Integer.valueOf(lastNumber);

        return lastNumberInt;

    }


}