package com.example.codewars.TenMinWalk;

import static com.example.codewars.TenMinWalk.TenMinWalk.isValid;
import static com.example.codewars.TenMinWalk.TenMinuteWalk.isValid2;

public class Main {

    public static void main(String[] args) {

char[] walk = {'e','e','e','e','e','w','w','w','w','w'};
char[] walk2 = {'e','e','e','e','e','w','w','w','w','w'};

boolean isValid = isValid(walk);
        System.out.println(isValid);

        boolean isValid2 = isValid(walk2);
        System.out.println(isValid2);
    }

}
