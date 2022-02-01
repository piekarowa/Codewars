package com.example.codewars.TwiceAsOld;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {
        if (sonYears == 0) {
            return dadYears;
        } else if (dadYears >= 2 * sonYears) {
            return dadYears - 2 * sonYears;
        } else if (dadYears < sonYears * 2) {
            return dadYears - sonYears;
        }else{
            return 0;
        }
    }
}
