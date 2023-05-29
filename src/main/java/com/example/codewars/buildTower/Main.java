package com.example.codewars.buildTower;

import static com.example.codewars.buildTower.TowerBuilder.towerBuilder;

public class Main {

    public static void main(String[] args) {

        int nFloors = 4;

        String[] tree = towerBuilder(nFloors);

        for(String line : tree){
            System.out.println(line);
        }



    }

}
