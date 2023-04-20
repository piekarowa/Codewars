package com.example.codewars.isogram;



public class Isogram {
    public static boolean isIsogram(String str) {


         if(str.length() == str.toLowerCase().chars().distinct().count()){
             return true;
         }else{
             return false;
         }

//        char[] letters = str.toLowerCase().toCharArray();
//
//        for (int i = 0; i < letters.length-1; i++) {
//           for(int j = i + 1; j <letters.length; j++){
//               char currentChar = letters[i];
//               char nextChar = letters[j];
//
//               if(currentChar == nextChar){
//                   return false;
//               }
//           }
//        }
//        return true;

    }
}
