package com.margieblair;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create a game loop!
        //lol i should actually learn how yahtzee works in order to do this
        int count = 0;
        Random rand = new Random();
        String player;
        YahtzeeConsole.welcome();
        Player myHand = new Player();
        myHand.roll(rand);
        while (count < 3) {
            YahtzeeConsole.displayDice(myHand.getDice());
            myHand.roll(rand, YahtzeeConsole.getChoices());
            YahtzeeConsole.displayDice(myHand.getDice());
            count++;
        }

    }
}
