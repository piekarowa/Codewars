package com.example.codewars.TenMinWalk;

public class TenMinuteWalk {

    public static boolean isValid2(char[] walk2) {

        if(walk2.length != 10){
            return false;
        }

        int countE = 0;
        int countW = 0;
        int countN = 0;
        int countS = 0;

        for(char direction : walk2){
            switch (direction){
                case 'e':
                    countE++;
                    break;
                case 'w':
                    countW++;
                    break;
                case 'n':
                    countN++;
                    break;
                case 's':
                    countS++;
                    break;
                default:
                    return false;
            }
        }

        return countN == countS && countE == countW;

    }


}
