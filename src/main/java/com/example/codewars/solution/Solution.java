package com.example.codewars.solution;

class Solution {
    public static String camelCase(String input) {

        String lowerCase = input.toLowerCase();

        if(!input.equals(lowerCase)){
            String newString = input.replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2");
            return newString;
            }else{
            return input;
        }
        }

    }
