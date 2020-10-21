package com.margieblair;

import java.util.ArrayList;
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

    static public int getChoice() {
        System.out.print("What die to you want to roll? 1-5: ");
        int input = scanner.nextInt()-1;
        return input;

        //Integer.parseInt("2") this would also work

    }

    static public void getChoices() {
        System.out.println("Which dice do you want to reroll? 1-5 Ex: 1 2 4" );
//        String input1 = scanner.next(); //1 2 4
////        scanner.nextLine();
//        String input2 = scanner.next();
////        scanner.nextLine();
//        String input3 = scanner.next();
        String input = scanner.nextLine(); //1 2 4

        String[] inputArray = input.split(" ");

        int[] choices = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            choices[i] = Integer.parseInt(inputArray[i]) - 1;
        }




    }
}
