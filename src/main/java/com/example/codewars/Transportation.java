package com.example.codewars;

public class Transportation {
    public static int rentalCarCost(int d) {

        if(d > 0 && d < 3){
            return d * 40;
        }else if(d >= 3 && d < 7){
            return d * 40 - 20;
        }else if(d >= 7){
            return d * 40 - 50;
        }else{
            return 0;
        }
}
}
