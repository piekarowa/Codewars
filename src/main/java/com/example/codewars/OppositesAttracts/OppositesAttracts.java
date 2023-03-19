package com.example.codewars.OppositesAttracts;

import com.sun.source.tree.BreakTree;

public class OppositesAttracts {


    public static boolean isLove(final int flower1, final int flower2) {

      boolean petals1;
      boolean petals2;
      boolean inLove = false;

      petals1 = (flower1 % 2) == 0;
      petals2 = (flower2 % 2) == 0;

      if(petals1 != petals2){
          inLove = true;
      }

      return inLove;

    }

}
