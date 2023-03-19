package com.example.codewars.Troll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Troll {

    public static String disemvowel(String str){


        return   str.replaceAll("[aeiou]", "");

    }

    public static void main(String[] args) {
        String example = "The input string contains vowels";

        System.out.println(disemvowel(example));

    }

}
