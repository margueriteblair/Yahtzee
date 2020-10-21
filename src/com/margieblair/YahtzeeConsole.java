package com.margieblair;

import java.util.List;

public class YahtzeeConsole extends Console{

    static public void welcome() {
        welcome("Yahtzee!");
    }

    static public void displayDice(List<Die> dice) {
        System.out.println("--------------");
        for (var die : dice) {
            System.out.println(die.getValue() + " ");
        }
        System.out.println("\n-------------");
    }
}
