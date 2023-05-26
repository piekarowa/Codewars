package com.example.codewars.tortoise;

public class Tortoise {

    public static int[] race(int v1, int v2, int g) {

        if(v1 >= v2){
            return null;
        }

        int speedDifference = v2 - v1;

        int totalSeconds = g * 3600 / speedDifference;
        int hour = totalSeconds / 3600;

        int minute = (totalSeconds % 3600) / 60;
        int second = totalSeconds % 60;

        return new int[]{hour, minute, second};


    }

}

//A starts 720 feet/h
//B runs faster than A, when starts aA has 70 feet lead, runs 850 feet/h
//how long it takes B to catch A
//v1 = 720, v2 = 850, g = 70
//B will catch A when they run same distance at the same time
//v = s/t
