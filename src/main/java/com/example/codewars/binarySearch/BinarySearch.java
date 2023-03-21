package com.example.codewars.binarySearch;



public class BinarySearch {

    public static void main(String[] args) {


        int[] ints = {1, 2, 4, 6, 9, 11, 23, 45, 54, 62, 78, 900};


        System.out.println(binarySearch(ints, 2));




    }


    private static int binarySearch(int[] numbers, int numberToFind){

        int low = 0;

        int high = numbers.length - 1;

        while(low <= high){

            int middlePosition = (low + high)/2;
            int middleNumber = numbers[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middleNumber -1;
            }else{
                low = middleNumber + 1;
            }

        }

        return -1;
    }
}