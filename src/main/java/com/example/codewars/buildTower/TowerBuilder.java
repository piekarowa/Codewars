package com.example.codewars.buildTower;

public class TowerBuilder {

    public static String[] towerBuilder(int nFloors)
    {

String[] tree = new String[nFloors];

int width = 2 * nFloors - 1;
int mid = width / 2;

for (int i = 0; i < nFloors; i++){
    StringBuilder sb = new StringBuilder();

    for(int j = 0; j < width; j++){
        if(j >= mid - 1 && j <= mid + 1){
            sb.append("*");
        }else{
            sb.append(" ");
        }
    }

    tree[i] = sb.toString();
}
return tree;

        }



    }


