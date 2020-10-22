package com.margieblair;

import java.util.List;
import java.util.ArrayList;

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

    static public List<Integer> getChoices() {
        System.out.println("Which dice do you want to reroll? 1-5 Ex: 1 2 4" );
//        String input1 = scanner.next(); //1 2 4
////        scanner.nextLine();
//        String input2 = scanner.next();
////        scanner.nextLine();
//        String input3 = scanner.next();
        String input = scanner.nextLine(); //1 2 4

        String[] inputArray = input.split(" ");

        List<Integer> choices = new ArrayList<>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice) - 1);
        }
        return choices;

    }
}
