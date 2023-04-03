package com.example.codewars.binarySearch;

public class BinarySearch2 {

    public static void main(String[] args) {

        int[] ints = {1, 2, 5, 7, 9, 11, 13};

        System.out.println(binarySearch2(ints, 15));


    }

    private static int binarySearch2(int[] numbers, int numberToFind){

        int low = 0;

        int high = numbers.length - 1;


        while(low <= high){
            int middlePosition = (low + high)/2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }

    }

}
