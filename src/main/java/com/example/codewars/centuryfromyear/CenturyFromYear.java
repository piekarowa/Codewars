package com.example.codewars.centuryfromyear;

public class CenturyFromYear {

    private final int year;

    public CenturyFromYear(int year) {
        this.year = year;
    }

    public int solution() {
        return (year + 99) / 100;
    }

}
