package com.example.codewars.GrassHopper;

public class GrassHopper {

    public static int summation(int n) {

        //4 = 1 + 2 + 3 + 4 = 10
        int result = 0;

        for(int i = n; i > 0; i--){
             result += i;
        }



        return result;
    }

}
