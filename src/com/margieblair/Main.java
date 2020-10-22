package com.margieblair;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create a game loop!
        //lol i should actually learn how yahtzee works in order to do this
        Random rand = new Random();
        YahtzeeConsole.welcome();
        Player myHand = new Player();
        myHand.roll(rand);
        YahtzeeConsole.displayDice(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayDice(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayDice(myHand.getDice());
        myHand.roll(rand, YahtzeeConsole.getChoices());
        YahtzeeConsole.displayDice(myHand.getDice());

    }
}
