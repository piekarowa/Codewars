package com.example.codewars.EvenFibonacciSum;

public class EvenFibonacciSum {

        public static void main(String[] args) {
                fibonacci(33);
        }



        public static long fibonacci(long max) {

                long firstNum = 0;
                long secondNum = 1;
                long nextNum;
                long n;

                for(long i = 0; i <= n; i++){
                        if(i <= 1) {
                                nextNum = i;
                        }else{
                                nextNum = firstNum + secondNum;
                                firstNum = secondNum;
                                secondNum = nextNum;

                        }
                        System.out.print(nextNum + " ");
                }

                return max;

        }


}
