package com.margieblair;

import java.util.Random;

public class PlayerRolls {
    private static int count = 0;
    static Random rand = new Random();

    public static void turn(Player myHand) {

        while (PlayerRolls.count < 3) {
            try {
                if (count == 0) YahtzeeConsole.welcome();
                YahtzeeConsole.displayDice(myHand.getDice());
                myHand.roll(rand, YahtzeeConsole.getChoices());
            } catch (NumberFormatException ex) {
                System.out.println("Input has to be in the form of a number 1 - 5! Restarting game...");
                count = 0;
                continue;
            }
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int newCount) {
        count = newCount;
    }
}
