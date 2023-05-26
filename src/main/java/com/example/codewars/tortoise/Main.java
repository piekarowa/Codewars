package com.example.codewars.tortoise;

public class Main {

    public static void main(String[] args) {

        int v1 = 720;
        int v2 = 850;
        int g = 70;

        int[] result = Tortoise.race(v1, v2, g);

        int hours = result[0];
        int minutes = result[1];
        int seconds = result[2];

        System.out.println("Time taken to catch up:");
        System.out.printf("%d hours, %d minutes, %d seconds%n", hours, minutes, seconds);

    }

}
