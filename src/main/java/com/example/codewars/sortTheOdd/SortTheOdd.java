package com.example.codewars.sortTheOdd;

import java.util.Arrays;

public class SortTheOdd {

    public static boolean isEven(int num){
        return num % 2 == 0;
    }


    public static int[] sortArray(int[] array) {

        int index = 0;
        int[] sortedArray = new int[array.length];


        for(int i = 0; i < array.length; i++){

            int number = Integer.parseInt(String.valueOf(array[i]));

            if(isEven(array[i])){
                sortedArray[i] = array[i];
            }else{
                sortedArray[index++] = array[i];
            }

        }

        Arrays.sort(sortedArray, 0 , index);

        index = 0;
        for(int i = 0; i < array.length; i++){
            if(!isEven(array[i])){
                array[i] = sortedArray[index++];
            }
        }
        return array;

    }

}

//sort array of numbers
//sort only odd numbers in ascending order leaving even numbers at their original places
