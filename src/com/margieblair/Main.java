package com.margieblair;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Die die = new Die();
        System.out.println(die.getValue());
        die.roll(rand);
        System.out.println(die.getValue());
        die.roll(rand);
        System.out.println(die.getValue());
        die.roll(rand);
        System.out.println(die.getValue());


    }
}
