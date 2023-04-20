package com.example.codewars.longestRepetition;

public class Solution {

        public static Object[] longestRepetition(String s) {

            int count = 0;
            int stringLength = s.length();
            char currentChar = s.charAt(0);

            for(int i = 0; i < stringLength; i++){
                int currentCount = 1;
                for (int j=i+1; j<stringLength; j++) {
                    if (s.charAt(i) != s.charAt(j))
                        break;
                    currentCount++;
                    }
                if(currentCount > count){
                    count = currentCount;
                    currentChar = s.charAt(i);
                }
            }

            return new Object[]{Character.toString(currentChar), count};
        }
    }

