package com.example.codewars.TenMinWalk;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {

        String[] stringArray = new String[walk.length];
        for(int i = 0; i < walk.length; i++){
            stringArray[i] = String.valueOf(walk[i]);
        }

        List<String> list = Arrays.asList(stringArray);

        int countN = Collections.frequency(list, "n");
        int countS = Collections.frequency(list, "s");
        int countE = Collections.frequency(list, "e");
        int countW = Collections.frequency(list, "w");

        return list.contains("e") && countE == countW &&
                list.contains("n") && countN == countS &&
                list.size() == 10;


    }
}

//walk takes 10 minutes
//one movement takes 1 minute
//you have to end in start point
//'n', 's', 'w', 'e'
//the same times e and w
//the same time n and s




