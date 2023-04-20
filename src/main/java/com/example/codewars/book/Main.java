package com.example.codewars.book;

import javax.swing.*;
import java.security.Key;
import java.util.Stack;

public class Main {


    public void lookForKey(Box mainBox) {
        Stack<Box> pile = mainBox.makeAPileToLookThrough();
        while (!pile.isEmpty()) {
            Box box = pile.pop();
            for (Item item : box.getItems()) {
                if (item instanceof Box) {
                    pile.push((Box) item);
                } else if (item instanceof Key) {
                    System.out.println("key found");
                }
            }
        }
    }

}
