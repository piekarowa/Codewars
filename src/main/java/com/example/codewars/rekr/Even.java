package com.example.codewars.rekr;

import java.util.Arrays;

//String[] numbers = new String[]{"-883", "-98", "0", "37", "28"}
//
//        Provide a solution that will print
//        "<<number>> is even!", for
//        even numbers and  "<<number>> is odd!" for odd numbers.
public class Even {

    public static void main(String[] args) {

    }


    String[] numbers = new String[]{"-883", "-98", "0", "37", "28"};



    //    int length = numbers.length;

    public void isEven(String[] numbers){
        Arrays.stream(numbers).map(number -> Integer.parseInt(number))
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num + " number is even"));

    for(int i = 0; i < numbers.length; i++){

            if(Integer.parseInt(numbers[i]) % 2 == 0){
                System.out.println(i + " number is even");
            }else{
                System.out.println(i + " number is odd");
            }

        }



    }


}
