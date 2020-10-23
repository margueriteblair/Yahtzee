package com.margieblair;

import java.util.ArrayList;
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

        while (true) {
            myHand.roll(rand);
            YahtzeeConsole.displayDice(myHand.getDice());
            if (YahtzeeConsole.getChoices().isEmpty()) {
                System.out.println("You are passing your turn to the next player");
                return;
            } else if (YahtzeeConsole.getChoices().get(0).equals(-1) || YahtzeeConsole.getChoices().get(0).equals(6)) {
                System.out.println("Please only input a POSITIVE integer that is between 1 - 5");
            } else {
                YahtzeeConsole.displayDice(myHand.getDice());
                myHand.roll(rand, YahtzeeConsole.getChoices());
                YahtzeeConsole.displayDice(myHand.getDice());
            }
        }

//        while (count < 3) {
//            YahtzeeConsole.displayDice(myHand.getDice());
//            myHand.roll(rand, YahtzeeConsole.getChoices());
//            YahtzeeConsole.displayDice(myHand.getDice());
//            count++;
//        }

    }
}
