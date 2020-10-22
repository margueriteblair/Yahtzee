package com.margieblair;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        YahtzeeConsole.welcome();
        Player myHand = new Player();
        myHand.roll(rand);
        YahtzeeConsole.displayDice(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayDice(myHand.getDice());
        YahtzeeConsole.displayDice(myHand.getDice());
        YahtzeeConsole.displayDice(myHand.getDice());

    }
}
