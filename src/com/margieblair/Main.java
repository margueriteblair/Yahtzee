package com.margieblair;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Player myHand = new Player();
        System.out.println(myHand.getDieValue(0));
        System.out.println(myHand.getDieValue(1));
        System.out.println(myHand.getDieValue(4));
        System.out.println("\n");
        myHand.roll(rand);
        System.out.println(myHand.getDieValue(0));
        System.out.println(myHand.getDieValue(1));
        System.out.println(myHand.getDieValue(4));
        System.out.println("\n");
        myHand.roll(rand, 1);
        myHand.roll(rand, 3);
        System.out.println(myHand.getDieValue(0));
        System.out.println(myHand.getDieValue(1));
        System.out.println(myHand.getDieValue(4));
        myHand.roll(rand);
        System.out.println("\n");
        System.out.println(myHand.getDieValue(0));
        System.out.println(myHand.getDieValue(1));
        System.out.println(myHand.getDieValue(4));


    }
}
