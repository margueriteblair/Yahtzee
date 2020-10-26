package com.margieblair;

import java.util.Random;

public class PlayerRolls {
    public static void turn(Player myHand) {
        int count = 0;
        Random rand = new Random();
        while (count < 3) {
            try {
                if (count == 0) YahtzeeConsole.welcome();
                YahtzeeConsole.displayDice(myHand.getDice());
//                    System.out.println();
                myHand.roll(rand, YahtzeeConsole.getChoices());
                YahtzeeConsole.displayDice(myHand.getDice());
//                }
            } catch (NumberFormatException ex) {
                System.out.println("Input has to be in the form of a number 1 - 5! Restarting game...");
                count = 0;
                continue;
            }
            count++;
        }
    }
}
