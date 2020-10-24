package com.margieblair;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int score=0;
        Random rand = new Random();
        YahtzeeConsole.welcome();
        Player myHand = new Player();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            while (count < 3) {
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
                count++;
            }
            System.out.println("Your final score is " + score + ", would you like to play again (1), or exit the game? (2)");
            int option = scanner.nextInt();
            if (option == 1) {
                continue;
            } else if (option == 2) {
                break;
            } else {
                System.out.println("Invalid option.");

            }

        }


    }
}
