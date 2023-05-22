package com.example.codewars.camelCase;

public class ToCamelCase {


        static String toCamelCase(String s){

            StringBuilder camelCase = new StringBuilder();
            boolean capitalizeNext = false;

           for(int i = 0; i < s.length(); i++){
               char c = s.charAt(i);

               if(c == '-' || c == '_'){
                   capitalizeNext = true;
               }else{
                   if(capitalizeNext){
                       camelCase.append(Character.toUpperCase(c));
                       capitalizeNext = false;
                   }else{
                       camelCase.append(c);
                   }
               }

           }
return camelCase.toString();


        }

    }


