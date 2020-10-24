package com.margieblair;

import java.util.List;
import java.util.ArrayList;


public class YahtzeeConsole extends Console{

    static public void welcome() {
        welcome("Yahtzee!");
    }

    static public void displayDice(List<Die> dice) {
        System.out.println("--------------\n");
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.println("\n");

    }

    static public int getChoice() {
        System.out.print("What die to you want to roll? 1-5: ");
        int input = scanner.nextInt()-1;
        return input;


    }

    static public List<Integer> getChoices() {
        System.out.println("Which die do you want to reroll? 1-5 Ex: 1 2 4. Or enter 0 to pass to the next player." );
        String input = scanner.nextLine(); //1 2 4
        String[] inputArray = input.split(" ");
        List<Integer> choices = new ArrayList<>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice) - 1);
        }
        return choices;

    }
}
